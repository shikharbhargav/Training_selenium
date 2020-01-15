@log in

Given <username> and <password>
When username and password are validated 
Then successful login
And display home page

Given <username> and <password>
When username and password are not validated
Then Error message is displayed

@product selection

Given Product is displayed
When Product is selected 
Then Add the product to the Cart

