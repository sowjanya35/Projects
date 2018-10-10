Feature: Login  page

  Scenario Outline: Test Login Page with user details
    Given Open given browser "chrome"
    Then user is on Login page
    When Enter the email "<username>" and Password "<password>"				
		When click login button

    Examples: 
      |username           |password |
      |ghjk@gmail.com     |123     |
      |ram@gmail.com    |456     |
