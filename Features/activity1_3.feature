@activity1_3
Feature: Posting a job using parameterization
  
 Scenario: Post a job using details passed from the Feature file
    Given Open browser with ​Alchemy Jobs site
    Then Go to Post a Job page
    And Enter the "username@abc.com", "Tester DP", "Bangalore", "This is test job", "username@abc.com", "IBM" details and click on the Preview button
    Then Click submit
    And Go to the Jobs page
    Then Confirm job listing "Tester DP" is shown on page
    And Close Browser
    
  
    