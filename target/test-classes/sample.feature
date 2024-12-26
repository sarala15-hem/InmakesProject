Feature:To validate the login functionality of filkart application
Scenario:To validate login with valid username and invalid password
Given To launch the chrome browser and maximize the window
When To launch the url of the flipkart application
And To click the login button
And To pass valid username in email field
And To check whether navigate to home page or not
Then To close the browser


Scenario Outline:To validate the positive and negative combination of login functionality
Given User has to launch the browser and maximize the window
When User has to hit the Gmail url
And User has to pass the data"<Emaildatas>" in email field
And User has to pass the data"<Passworddatas>" in password field
And User has to click the login button
Then User has to close the browser

Examples:
|Emaildatas               |Passworddatas|
|Seleniuminmakes@gmail.com|Inmakes|
|saralalaks15134@gmail.com|hemanatha45@|
|abc@gmail.com            |8741254|
|inmakesinter@gmail.com   |ksdjkjrei|
