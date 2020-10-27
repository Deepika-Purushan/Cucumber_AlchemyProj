$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("activity1_4.feature");
formatter.feature({
  "line": 2,
  "name": "Posting a job using parameterization",
  "description": "",
  "id": "posting-a-job-using-parameterization",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@activity1_4"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Post a job using details passed from the Feature file",
  "description": "",
  "id": "posting-a-job-using-parameterization;post-a-job-using-details-passed-from-the-feature-file",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open browser with ​Alchemy Jobs site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Go to Post a Job page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter the \"\u003cemail\u003e\", \"\u003cjobTitle\u003e\", \"\u003clocation\u003e\", \"\u003cdesc\u003e\", \"\u003cemail1\u003e\", \"\u003ccompany\u003e\" details and click on the Preview button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click submit",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Go to the Jobs page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Confirm job listing \"\u003cjobTitle1\u003e\" is shown on page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "posting-a-job-using-parameterization;post-a-job-using-details-passed-from-the-feature-file;",
  "rows": [
    {
      "cells": [
        "email",
        "jobTitle",
        "location",
        "desc",
        "email1",
        "company",
        "jobTitle1"
      ],
      "line": 15,
      "id": "posting-a-job-using-parameterization;post-a-job-using-details-passed-from-the-feature-file;;1"
    },
    {
      "cells": [
        "username@abc.com",
        "Tester DP",
        "Bangalore",
        "This is test job",
        "username@abc.com",
        "IBM",
        "Tester DP"
      ],
      "line": 16,
      "id": "posting-a-job-using-parameterization;post-a-job-using-details-passed-from-the-feature-file;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Post a job using details passed from the Feature file",
  "description": "",
  "id": "posting-a-job-using-parameterization;post-a-job-using-details-passed-from-the-feature-file;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@activity1_4"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open browser with ​Alchemy Jobs site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Go to Post a Job page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter the \"username@abc.com\", \"Tester DP\", \"Bangalore\", \"This is test job\", \"username@abc.com\", \"IBM\" details and click on the Preview button",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click submit",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Go to the Jobs page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Confirm job listing \"Tester DP\" is shown on page",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "postJob.openBrowser()"
});
formatter.result({
  "duration": 9790694400,
  "status": "passed"
});
formatter.match({
  "location": "postJob.clickPostJob()"
});
formatter.result({
  "duration": 2313098700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username@abc.com",
      "offset": 11
    },
    {
      "val": "Tester DP",
      "offset": 31
    },
    {
      "val": "Bangalore",
      "offset": 44
    },
    {
      "val": "This is test job",
      "offset": 57
    },
    {
      "val": "username@abc.com",
      "offset": 77
    },
    {
      "val": "IBM",
      "offset": 97
    }
  ],
  "location": "postJob.enterDetails(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2903576900,
  "status": "passed"
});
formatter.match({
  "location": "postJob.clickOnSubmitButton()"
});
formatter.result({
  "duration": 623843800,
  "status": "passed"
});
formatter.match({
  "location": "postJob.gotoJobsPage()"
});
formatter.result({
  "duration": 823466600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tester DP",
      "offset": 21
    }
  ],
  "location": "postJob.confirmJobListing(String)"
});
formatter.result({
  "duration": 1945746400,
  "status": "passed"
});
formatter.match({
  "location": "postJob.closeTheBrowser()"
});
formatter.result({
  "duration": 1220094000,
  "status": "passed"
});
});