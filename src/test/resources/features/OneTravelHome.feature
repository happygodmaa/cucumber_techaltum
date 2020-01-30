Feature: Title of your feature
  I want to Onetravel homepage features such as
  	Widget fillup
  	Initiate search with advance options
  	Verification of all tabs - Flights, Hotels, Cars
  	Flight deals from popular destinations
  	Verify Onetravel credit card option
  	etc

  @Smoke
  Scenario: Fill widget and initiate search - Oneway
    Given User is on onetravel home page
     Then Verify that flight tab is selected
     Then Veriy that oneway is  selected
      And Enter source city "<NYC>"
     Then Enter destination city "<LON>"
      And select depart date "<22Dec>"
     Then Click on search now
      And Listing page should appear
     Then Verify search details on Listing page

  @Smoke
  Scenario: Fill widget and initiate search - Round Trip
    Given User is on onetravel home page
     Then Verify that flight tab is selected
     Then Veriy that round trip is selected
      And Enter source city
     Then Enter destination city
      And select depart date
      And select return date
     Then Click on search now
      And Listing page should appear
     Then Verify search details on Listing page
      And Send tickets to passengers
      | Passengers_Name |
      | Sachin          |
      | Sanjay          |
      | Nikhil          |
      And Please do practice

  @Regression
  Scenario Outline: Search initiate on Onetravel home page
    Given user is on onetravel home page
     Then initiate search with "<From>", "<To>", "<DepartDate>", "<ReturnDate>"
     Then Click on search button

    Examples: 
      | From | To  | DepartDate | ReturnDate |
      | NYC  | LON | 22Dec      | 25Dec      |
      | DEL  | MUM | 11Jan      | 15Jan      |
#Examples is last step when using Scenario outline 
