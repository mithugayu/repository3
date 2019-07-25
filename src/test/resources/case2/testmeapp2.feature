Feature: TestMe application
Test the TestMeApp in the cucumber
Scenario Outline: validate login functionality
Given click the sign in button
When enter the "<username>"
And "<password>" to be entered
And login to testme application
Then close the application


Examples:
 |username | password |
 |gayathri | gayu21   |
 |sathiya  | sathu19  |
 |deekshana| deekshu25|