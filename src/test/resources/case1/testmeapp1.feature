Feature: Test TestMeApp
Test the TestMeApp application


Scenario Outline: Validate register functionality
Given open the application
When enter the <user name> as 
And Enter name <first name> as 
And Enter <last name> as 
And Enter the pass <password> details as 
And Enter cpass <confrim password> as 
And Select the gender
And Enter the emailid as "sathiya@gmail.com"
And Enter the mobile number as "9876543210"
And Enter dob <dob> as 
And Enter the address as "asdfghjklz"
Then Select the security questions
And Enter the ans "<answer>" for the qns as 
Then click register



Examples:

|user name|first name|last name|password|confrim password|dob     |answer|
|gayathri |gayathri  |baskar   |gayu21  |gayu21          |21/07/98|pink  |
|sathiya  |sathiya   |narayana |sathu19 |sathu19         |19/01/99|blue  |

