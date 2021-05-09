$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/technicalexercisescenario.feature");
formatter.feature({
  "name": "Technical Exercise",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login, Create \u0026 delete Categories, Logout",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User \"ROHAN\" is logged to WPN Staging",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestSteps.user_is_logged_to_WPN(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get navigated to welcome page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TechicalExerciseTestSteps.user_should_get_navigated_to_welcome_page_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to back end Admin Panel",
  "keyword": "And "
});
formatter.match({
  "location": "TechicalExerciseTestSteps.user_navigate_to_back_end_Admin_Panel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on categories",
  "keyword": "And "
});
formatter.match({
  "location": "TechicalExerciseTestSteps.user_clicks_on_categories()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user creates a category \"Movies\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TechicalExerciseTestSteps.user_creates_a_category(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "category should get created successfully \"Movies\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TechicalExerciseTestSteps.category_should_get_created_successfully(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deletes the category \"Movies\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TechicalExerciseTestSteps.user_deletes_the_category(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "category should get deleted successfully \"Movies\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TechicalExerciseTestSteps.category_should_get_deleted_successfully(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Goto My site",
  "keyword": "And "
});
formatter.match({
  "location": "TechicalExerciseTestSteps.user_clicks_on_Goto_My_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get navigated to welcome page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TechicalExerciseTestSteps.user_should_get_navigated_to_welcome_page_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "logged out of the application",
  "keyword": "And "
});
formatter.match({
  "location": "TechicalExerciseTestSteps.logged_out_of_the_appliacation()"
});
formatter.result({
  "status": "passed"
});
});