$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature.feature");
formatter.feature({
  "line": 1,
  "name": "Some terse yet descriptive text of what is desired",
  "description": "In order to realize a named business value\r\nAs an explicit system actor\r\nI want to gain some beneficial outcome which furthers the goal",
  "id": "some-terse-yet-descriptive-text-of-what-is-desired",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Login successful",
  "description": "",
  "id": "some-terse-yet-descriptive-text-of-what-is-desired;login-successful",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user navigates to Amazon",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter correct username and password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_navigates_to_Amazon()"
});
formatter.result({
  "duration": 10248056622,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.i_enter_correct_username_and_password()"
});
formatter.result({
  "duration": 16099481494,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.login_should_be_successful()"
});
formatter.result({
  "duration": 1559830211,
  "status": "passed"
});
});