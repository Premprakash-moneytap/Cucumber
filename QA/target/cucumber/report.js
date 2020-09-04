$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/DELL/Desktop/Test download/Cucumber/QA/src/main/java/Feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "LoginScenario",
  "description": "",
  "id": "login;loginscenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Call_Auth",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Fetch_Auth",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Validate",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstep.call_auth()"
});
formatter.result({
  "duration": 3325083600,
  "status": "passed"
});
formatter.match({
  "location": "Loginstep.fetch_auth()"
});
formatter.result({
  "duration": 2350922000,
  "status": "passed"
});
formatter.match({
  "location": "Loginstep.Validate()"
});
formatter.result({
  "duration": 32600,
  "status": "passed"
});
});