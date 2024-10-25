$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:CoforgeFeature/Login2.feature");
formatter.feature({
  "name": "login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate login and logout functionality with valid user credentials JUNIT Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Username as \"Admin\" and Password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page URL should contains be \"dashboard\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_URL_should_contains_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on user dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_user_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Logout",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page URL should contains be \"/auth/login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_URL_should_contains_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});