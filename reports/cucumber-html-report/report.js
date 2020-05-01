$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Testcases.feature");
formatter.feature({
  "line": 2,
  "name": "Opencart website",
  "description": "This is to validate the opencart website",
  "id": "opencart-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@opencart"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "to validate the register functionality",
  "description": "",
  "id": "opencart-website;to-validate-the-register-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "launch the Browser  and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "url is enterd",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on myaccount and register",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "enter \u003cuserfname\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "enter \u003cuserlname\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enter \u003cuseremail\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "enter \u003ctelenumber\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "enter \u003cpass\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "enter \u003cconfirm\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "complete the registration",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition_Register.launch_the_Browser_and_enter_the_url()"
});
formatter.result({
  "duration": 23718467900,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Register.url_is_enterd()"
});
formatter.result({
  "duration": 1875677700,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Register.click_on_myaccount_and_register()"
});
formatter.result({
  "duration": 4633884200,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Register.enter_userfname()"
});
formatter.result({
  "duration": 1010071300,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Register.enter_userlname()"
});
formatter.result({
  "duration": 160781800,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Register.enter_useremail()"
});
formatter.result({
  "duration": 523433700,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Register.enter_telenumber()"
});
formatter.result({
  "duration": 240506000,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Register.enter_pass()"
});
formatter.result({
  "duration": 319707200,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Register.enter_confirm()"
});
formatter.result({
  "duration": 322830100,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Register.complete_the_registration()"
});
formatter.result({
  "duration": 6623264700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "To validate login functionatlity",
  "description": "",
  "id": "opencart-website;to-validate-login-functionatlity",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "Launch the browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "navigate to login page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "enter \u003cemail\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "enter \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition_loginpage.launch_the_browser_and_enter_url()"
});
formatter.result({
  "duration": 11187013600,
  "status": "passed"
});
formatter.match({
  "location": "Definition_loginpage.navigate_to_login_page()"
});
formatter.result({
  "duration": 2683317500,
  "status": "passed"
});
formatter.match({
  "location": "Definition_loginpage.enter_email()"
});
formatter.result({
  "duration": 11639823600,
  "status": "passed"
});
formatter.match({
  "location": "Definition_loginpage.enter_password()"
});
formatter.result({
  "duration": 518685000,
  "status": "passed"
});
formatter.match({
  "location": "Definition_loginpage.click_on_login_button()"
});
formatter.result({
  "duration": 5307147200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 28,
  "name": "To validate Searching  product and reviewing",
  "description": "",
  "id": "opencart-website;to-validate-searching--product-and-reviewing",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 29,
  "name": "launch browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "enter the product in \"\u003csrchbar\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "select the product and review it",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "opencart-website;to-validate-searching--product-and-reviewing;",
  "rows": [
    {
      "cells": [
        "srchbar"
      ],
      "line": 34,
      "id": "opencart-website;to-validate-searching--product-and-reviewing;;1"
    },
    {
      "cells": [
        "mac"
      ],
      "line": 35,
      "id": "opencart-website;to-validate-searching--product-and-reviewing;;2"
    },
    {
      "cells": [
        "mac"
      ],
      "line": 36,
      "id": "opencart-website;to-validate-searching--product-and-reviewing;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 35,
  "name": "To validate Searching  product and reviewing",
  "description": "",
  "id": "opencart-website;to-validate-searching--product-and-reviewing;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@opencart"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "launch browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "enter the product in \"mac\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "select the product and review it",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition_search_review.launch_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 11818648000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mac",
      "offset": 22
    }
  ],
  "location": "Definition_search_review.enter_the_product_in(String)"
});
formatter.result({
  "duration": 12164348900,
  "status": "passed"
});
formatter.match({
  "location": "Definition_search_review.select_the_product_and_review_it()"
});
formatter.result({
  "duration": 7692797000,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "To validate Searching  product and reviewing",
  "description": "",
  "id": "opencart-website;to-validate-searching--product-and-reviewing;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@opencart"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "launch browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "enter the product in \"mac\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "select the product and review it",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition_search_review.launch_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 12238949500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mac",
      "offset": 22
    }
  ],
  "location": "Definition_search_review.enter_the_product_in(String)"
});
formatter.result({
  "duration": 9296377100,
  "status": "passed"
});
formatter.match({
  "location": "Definition_search_review.select_the_product_and_review_it()"
});
formatter.result({
  "duration": 7278443400,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "To validate the password change functionality",
  "description": "",
  "id": "opencart-website;to-validate-the-password-change-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "Launch the Browser and enter the opencart url",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "after login navigate to my accounts",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "change the password",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition_passwordchange.launch_the_Browser_and_enter_the_opencart_url()"
});
formatter.result({
  "duration": 13601553400,
  "status": "passed"
});
formatter.match({
  "location": "Definition_passwordchange.after_login_navigate_to_my_accounts()"
});
formatter.result({
  "duration": 9909131600,
  "status": "passed"
});
formatter.match({
  "location": "Definition_passwordchange.change_the_password()"
});
formatter.result({
  "duration": 6917117100,
  "status": "passed"
});
});