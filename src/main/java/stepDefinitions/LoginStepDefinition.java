package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	
	WebDriver driver;
	
	
	@Given("^user is on main Page$")
	public void user_is_on_main_page(){
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http:/www.freecrm.com");
		}
	@When("^title of page is Free CRM$")
	public void title_of_page_is_Free_CRM(){
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Free CRM software for any business with sales, support and customer relationship management", title);
		}
	@Then("^user clicks on login$")
	public void user_clicks_on_login() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		}
	
	//**** SIMPLE DATA DRIVEN APPROACH
	//Reg Exp:			
	//Then user enters sp4tel12@gmail.com and Abcd@1234	------------------data is taken from feature file
	//1. \"([^\"]*)\"
	//2. \"(.*)\"
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);}
	
	/*@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("email")).sendKeys("sp4tel12@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Abcd@1234");}*/
		
	@Then("^user clicks on login button$")
public void user_clicks_on_login_button() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		}
	@Then("user is on home page")
public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home page title = "+ title);
		Assert.assertEquals("Cogmento CRM", title);
	}
	
	@Then("user creates new contact")
	public void user_creates_new_contact() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(2000);
		Actions builder = new Actions(driver);
		//WebElement usericone = driver.findElement(By.xpath("//*[text()='Contacts']"));
	   builder.moveToElement(driver.findElement(By.xpath("//*[text()='Contacts']"))).build().perform();
	   WebElement addContact = driver.findElement(By.xpath("//div[@id='main-nav']/div[3]/button[1]"));
	   addContact.click();
	   
	}
	@Then("^user enters contact \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_contact_firstname_and_lastname_and_position(String firstname, String lastname, String position) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.name("first_name"))).build().perform();
		driver.findElement(By.name("first_name")).sendKeys(firstname);
	   driver.findElement(By.name("last_name")).sendKeys(lastname);
	   driver.findElement(By.name("position")).sendKeys(position);
	}
	@Then("user clicks on save button")
	public void user_clicks_on_save_button() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='save icon']")).click();
	}
	@Then("go back to contacts")
	public void go_back_to_contacts() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//i[@class='home icon']")).click();
		driver.findElement(By.xpath("//*[text()='Contacts']")).click();
	  
	}
	@Then("user delete previos contacts")
	public void user_delete_previos_contacts() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@class,'ui celled')]//tr[1]//div[1]/button[1]")).click();
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
	   
	}
		@And("close the browser")
public void close_the_driver() throws InterruptedException {
			//Thread.sleep(2000);
			driver.quit();
	}
		}
		
