package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_already_on_login_page() {
	System.setProperty("webdriver.chrome.driver", "D:\\Study Material\\QE\\chromedriver.exe");
	driver = new ChromeDriver();	
	driver.get("https://ui.freecrm.com/");
	}
	
	@When("^title of login page Free CRM$")
	public void title_of_login_page_Free_CRM() {
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("Cogmento CRM",title);
	}

/*	@Then("^user enters username AND password$")
	public void user_enters_username_AND_password() {
		driver.findElement(By.name("email")).sendKeys("ravi_kuhada@hotmail.com");
		driver.findElement(By.name("password")).sendKeys("Ravi1988");
	}
	*/
	/*@Then("^user enters \"([^\"]*)\" AND password$")
	public void user_enters_AND_password(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys("");
	}*/
	
	
	@Then("^user enters \"([^\"]*)\" AND \"([^\"]*)\"$")
	public void user_enters_AND(String username, String password) throws Throwable {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		/*driver.findElement(By.className("ui fluid large blue submit button")).click();
		 WebElement loginBtn =
		 driver.findElement(By.xpath("//input[@type='submit']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", loginBtn);*/
	}

}
