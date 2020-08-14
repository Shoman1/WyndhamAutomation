package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class Steps {

	WebDriver driver;
	LoginPage loginPage;

	@Given("^User launch Chrome brouser$")
	public void user_launch_chrome_brouser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@When("^open URL \\\"([^\\\"]*)\\\"$")
	public void open_url(String string) {
		driver.get(string);

	}

	@When("^User Click on Sign in button$")
	public void user_click_on_sign_in_button() {

		loginPage = new LoginPage(driver);
		loginPage.clickOnSignin();

	}

	@When("^User enter Username and Password and click on Signin button$")
	public void user_enter_and_and_click_on_signin_button() {
		loginPage.enterCredential();
	}

	@Then("^User enter Answer to Security question and click on submit button$")
	public void user_enter_Answer_to_security_question_and_click_on_submit_button() {
		loginPage.answerSecurityQuetion();

	}

	@Then("^Title of the landing page should be \\\"([^\\\"]*)\\\"$")
	public void title_of_the_landing_page_should_be(String string) {
		loginPage.validateHomePageTitle();
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

	@Then("^click on my account$")
	public void click_on_my_account() {
		Assert.assertEquals(false, true);

	}

	@Then("^Change Primary Phone Number and Phone Type$")
	public void change_Primary_Phone_Number_and_Phone_Type() {

	}

	@Then("^Also change Birthday$")
	public void also_change_Birthday() {

	}

}
