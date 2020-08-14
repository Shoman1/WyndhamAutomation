package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'SIGN IN')]")
	WebElement signInLink;

	@FindBy(xpath = "//input[@id='wrUsername']")
	WebElement usernameField;

	@FindBy(xpath = "//input[@id='wrPassword']")
	WebElement passwordField;

	@FindBy(xpath = "//div[contains(text(),'Sign in')]")
	WebElement signinBtn;

	@FindBy(xpath = "//p[@id='securityQuestion']")
	WebElement securityQuestion;

	// In what city or town did you meet your spouse/partner?
	// What is your favorite pet's name?

	@FindBy(xpath = "//input[@id='securityAnswer']")
	WebElement securityAnswer;

	@FindBy(xpath = "//button[@id='submit-button']")
	WebElement submitBtn;

	// Wyndham Hotels &amp; Resorts | Search for Hotel Room Rates, Deals, and
	// Getaways

	public void clickOnSignin() {
		signInLink.click();
	}

	public void enterCredential() {
		usernameField.clear();
		usernameField.sendKeys("Wyndhamtd14");

		passwordField.clear();
		passwordField.sendKeys("Wyndham1");

		signinBtn.click();
	}

	public void answerSecurityQuetion() {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String question = securityQuestion.getText();
		System.out.println(question);

		if (question.contains("In what city or town did you meet your spouse/partner?")) {
			securityAnswer.sendKeys("city");
		}

		else if (question.contains("What is your favorite pet's name?")) {
			securityAnswer.sendKeys("pet");

		} else if (question.contains("What is the name of your favorite childhood friend?")) {
			securityAnswer.sendKeys("friend");

		} else {
			System.out.println("Security Question Mismatched");
			Assert.assertEquals(true, false);
		}
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		submitBtn.click();
	}

	public void validateHomePageTitle() {
		String eTitle = "Wyndham Hotels & Resorts | Search for Hotel Room Rates, Deals, and Getaways";
		String aTitle = ldriver.getTitle();
		System.out.println(aTitle);
		Assert.assertEquals(aTitle, eTitle);

	}

}
