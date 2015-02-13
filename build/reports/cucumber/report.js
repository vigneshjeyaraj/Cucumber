$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "id": "gmail-testing-scenarios.",
  "description": "",
  "name": "Gmail Testing scenarios.",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "gmail-testing-scenarios.;user-login-to-gmail-with-valid-credentials.",
  "description": "",
  "name": "User login to GMail with valid credentials.",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "Navigate to Login Page.",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "provide valid Username and Password.",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "Validate the user is logged in.",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "StepDefinitions.groovy:6"
});
