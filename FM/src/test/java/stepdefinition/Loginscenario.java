package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginscenario {

	public WebDriver driver;
	@Given("user is navigating to the UrbanLadder url")
	public void user_is_navigating_to_the_urban_ladder_url() {
	    System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.urbanladder.com/");
	    driver.manage().window().maximize();
	    System.out.println("Navigate to UrbanLadder page");
	}

	@And("go to login and click")
	public void go_to_login_and_click() {
		driver.findElement(By.id("home")).click();
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[2]/span/ul/li[1]/a")).click();
	  
	    System.out.println("Go to login and click");
	}

	@When("email and password are entered")
	public void email_and_password_are_entered() {
	    driver.findElement(By.name("spree_user[email]")).sendKeys("boyamouni24@gmail.com");
	    driver.findElement(By.name("spree_user[password]")).sendKeys("MSiva2425@");
	    System.out.println("Enter username and password");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.name("commit")).click();
	    System.out.println("click on login button");
	}

	@Then("dislpay the user home page")
	public void dislpay_the_user_home_page() {
	    driver.findElement(By.xpath("//*[@id=\"shortlist-badge\"]/span[1]/svg")).click();
	    boolean status = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).isDisplayed();
	    if(status) {
	    System.out.println("Display home page");
	    }
	}
	

	@And("close the application")
	public void close_the_application() {
	    driver.close();
	    System.out.println("Application is closed");
	}



}
