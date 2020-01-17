@log in

Given I have a valid <username> and <password>
When I enter the details and click on log in
Then successful login
And display home page

Given i have a invalid <username> and <password>
When i enter the username and password and click log in
Then Error message is displayed

@product selection

Given i have loggen in the website
And  I am displayed Product page
When I click on the add button under Product 
Then product is selected 
And  the product is added to the Cart

