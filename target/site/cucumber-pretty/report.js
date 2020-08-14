$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sucessfull login wih valid scenerios",
  "description": "",
  "id": "login;sucessfull-login-wih-valid-scenerios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launch Chrome brouser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "open URL \"http://rqa.wyndhamhotels.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enter Username and Password and click on Signin button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter Answer to Security question and click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Title of the landing page should be \"Wyndham Hotels \u0026 Resorts | Search for Hotel Room Rates, Deals, and Getaways\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_chrome_brouser()"
});
formatter.result({
  "duration": 5544497600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://rqa.wyndhamhotels.com/",
      "offset": 10
    }
  ],
  "location": "Steps.open_url(String)"
});
formatter.result({
  "duration": 6657017600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_sign_in_button()"
});
formatter.result({
  "duration": 3525524100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enter_and_and_click_on_signin_button()"
});
formatter.result({
  "duration": 1016078500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enter_Answer_to_security_question_and_click_on_submit_button()"
});
formatter.result({
  "duration": 12562448100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wyndham Hotels \u0026 Resorts | Search for Hotel Room Rates, Deals, and Getaways",
      "offset": 37
    }
  ],
  "location": "Steps.title_of_the_landing_page_should_be(String)"
});
formatter.result({
  "duration": 94649900,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d84.0.4147.105)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027LTIN187529\u0027, ip: \u0027192.168.43.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.105, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\845348\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:55393}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: eaac47326750a8087004d5163a778c49\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:602)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:277)\r\n\tat pageObjects.LoginPage.validateHomePageTitle(LoginPage.java:90)\r\n\tat stepDefinations.Steps.title_of_the_landing_page_should_be(Steps.java:55)\r\n\tat ✽.Then Title of the landing page should be \"Wyndham Hotels \u0026 Resorts | Search for Hotel Room Rates, Deals, and Getaways\"(./Features/Login.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});