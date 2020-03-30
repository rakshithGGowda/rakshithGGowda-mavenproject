$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/feature1.feature");
formatter.feature({
  "name": "Methods on JSON server",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user sets base URI of JSON server",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.MyStepdefs.userPerformsGETOperationFor()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "GET operation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user performs GET for post  number \"2\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.MyStepdefs.userPerformsGETForPostNumber(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "author name must say \"Rakshith G\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.MyStepdefs.authorNameMustSay(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user sets base URI of JSON server",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.MyStepdefs.userPerformsGETOperationFor()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Obtain collection of data from JSON server",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "author names must be seen",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.MyStepdefs.authorNamesMustBeSeen()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user sets base URI of JSON server",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.MyStepdefs.userPerformsGETOperationFor()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Path parameters",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "path parameters must be passed",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.MyStepdefs.parametersMustBePassed()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user sets base URI of JSON server",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.MyStepdefs.userPerformsGETOperationFor()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Query parameters",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "query parameters must be passed",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.MyStepdefs.queryParametersMustBePassed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Adding new post using POST Method",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user performs POST for creating post",
  "keyword": "When "
});
formatter.step({
  "name": "new \"\u003cid\u003e\",\"\u003cname\u003e\" and \"\u003cauthor\u003e\" are passed",
  "keyword": "And "
});
formatter.step({
  "name": "new post has been created",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "id",
        "title",
        "author"
      ]
    },
    {
      "cells": [
        "4",
        "Transaction 800Rs",
        "Indu"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user sets base URI of JSON server",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.MyStepdefs.userPerformsGETOperationFor()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding new post using POST Method",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user performs POST for creating post",
  "keyword": "When "
});
formatter.match({
  "location": "steps.MyStepdefs.userPerformsPOSTForCreatingPost()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new \"4\",\"\u003cname\u003e\" and \"Indu\" are passed",
  "keyword": "And "
});
formatter.match({
  "location": "steps.MyStepdefs.newAndArePassed(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new post has been created",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.MyStepdefs.newPostMustBeCreated()"
});
formatter.result({
  "status": "passed"
});
});