@activity1_4
Feature: Posting a job using parameterization
  
 Scenario Outline: Post a job using details passed from the Feature file
    Given Open browser with ​Alchemy Jobs site
    Then Go to Post a Job page
    And Enter the "<email>", "<jobTitle>", "<location>", "<desc>", "<email1>", "<company>" details and click on the Preview button
    Then Click submit
    And Go to the Jobs page
    Then Confirm job listing "<jobTitle1>" is shown on page
    And Close Browser
    
   
Examples: 
      | email | jobTitle | location | desc | email1 | company | jobTitle1 |
      | username@abc.com | Tester DP | Bangalore | This is test job | username@abc.com | IBM | Tester DP | 
    