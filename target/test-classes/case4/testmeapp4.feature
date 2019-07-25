Feature: TestMe application
Test the TestMeApp in the cucumber


Scenario Outline: validate login functionality
Given click the sign in button
When enter the <username>
And <password> to be entered
And login to testme application
And search the particular products like headphones
And tries to proceed the payment without add to cart
Then testmeapp doesn't display cart icon

Examples:
   | username | password |
   | sathiya  | sathu19  |