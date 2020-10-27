package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class createUser {
	WebDriver driver;
	WebDriverWait wait;

	Double a = (Math.random() + 1) * 10000;
	String userName = "Username_" + Math.round(a);
	String emailId = userName + "@hmail.com";	
	
	@Given("^Open a browser$")
	public void openBrowser() {	
		//Setup instances
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
	}
	@When("^Navigate to Alchemy Jobs and log in$")
	public void login() {
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).clear();
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).clear();
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
	}
	@Then("^Locate the left hand menu and click the menu item that says Users$")
	public void clickUsers() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a/div[text()='Users']")));
		driver.findElement(By.xpath("//a/div[text()='Users']")).click();
	}
	@And("^Locate the Add New button and click it$")
	public void clickAddButton() {
		driver.findElement(By.linkText("Add New")).click();
	}
	@Then("^Fill in the necessary details$")
	public void enterDetails() {
		driver.findElement(By.id("user_login")).clear();
		driver.findElement(By.id("user_login")).sendKeys(userName);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(emailId);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
	}
	@And("^Click the Add New User button$")
	public void clickAddNewUserButton() {
		driver.findElement(By.id("createusersub")).click();		
	}

	@Then("^Verify that the user was created$")
	public void verifyUserCreation() {
		driver.findElement(By.id("user-search-input")).clear();
		driver.findElement(By.id("user-search-input")).sendKeys(userName);
		driver.findElement(By.id("search-submit")).click();
		String actualUserName = driver.findElement(By.linkText(userName)).getText();
		Assert.assertEquals(actualUserName, userName);
	}

	@And("^Close the browser$")
	public void closeTheBrowser() throws Throwable {
		driver.quit();
	}
}
	