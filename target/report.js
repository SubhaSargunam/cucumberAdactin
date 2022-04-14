$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login.feature");
formatter.feature({
  "name": "Validating the login page of Adactin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating login by entering valid username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Adactin Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_Adactin_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the userName \u0027Sargunam\u0027 and password \u0027OE9LXG\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_userName_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the user enters into Search Hotel page.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.validate_the_user_enters_into_Search_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});