package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class postJob {
	WebDriver driver;
	WebDriverWait wait;
	
	Double a = (Math.random() + 1) * 10000;

	@Given("^Open browser with ​Alchemy Jobs site$")
	public void openBrowser() throws Throwable {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		driver.get("https://alchemy.hguy.co/jobs");
		driver.manage().window().maximize();
	}

	@Then("^Go to Post a Job page$")
	public void clickPostJob() {
		driver.findElement(By.linkText("Post a Job")).click();
	}
	@And("^Enter the \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\" details and click on the Preview button$")
	public void enterDetails(String email, String jobTitle, String location, String desc, String email1, String company) {
		driver.findElement(By.id("create_account_email")).sendKeys(a+email);
		driver.findElement(By.id("job_title")).sendKeys(a+jobTitle);
		driver.findElement(By.id("job_location")).sendKeys(location);
		
		WebElement iframe = driver.findElement(By.id("job_description_ifr"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("/html/body")).sendKeys(desc+a);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("application")).sendKeys(a+email1);
		driver.findElement(By.id("company_name")).sendKeys(company);
		driver.findElement(By.name("submit_job")).click();
	}
	@Then("^Click submit$")
	public void clickOnSubmitButton() {
		driver.findElement(By.id("job_preview_submit_button")).click();
	}

	@And("^Go to the Jobs page$")
	public void gotoJobsPage() {
		driver.findElement(By.linkText("Jobs")).click();
	}
	@Then("^Confirm job listing \"(.*)\" is shown on page$")
	public void confirmJobListing(String jobTitle1) {
		driver.findElement(By.linkText("Jobs")).click();
		driver.findElement(By.id("search_keywords")).clear();
		driver.findElement(By.id("search_keywords")).sendKeys(a+jobTitle1);
		driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
		wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div/h3[text()='" + a+jobTitle1 + "']")));
		String actualJobTitle = driver.findElement(By.xpath("//div/h3[text()='" + a+jobTitle1 + "']")).getText();
		Assert.assertEquals(actualJobTitle, a+jobTitle1);
	}

	@And("^Close Browser$")
	public void closeTheBrowser() throws Throwable {
		driver.quit();
	}

}
