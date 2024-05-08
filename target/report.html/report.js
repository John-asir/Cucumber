$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Admin/New%20folder/Cucumber/src/test/resources/Features/Login.Features");
formatter.feature({
  "name": "",
  "description": "\t\t\t\tTo validate Login Fuctionality of facebook",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "\t\t\t\tTo check with valid email and invalid password",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User have to opne chrome browser and facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefintion.user_have_to_opne_chrome_browser_and_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid email and invalid password to corresponding fields",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefintion.to_pass_the_valid_email_and_invalid_password_to_corresponding_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefintion.to_close_Browser()"
});
formatter.result({
  "status": "passed"
});
});