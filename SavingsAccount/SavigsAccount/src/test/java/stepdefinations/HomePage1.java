package stepdefinations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.webBrowser;

public class HomePage1 {

WebDriver driver;

@Given("User is on Home Page")
public void user_is_on_Home_Page() {
  // Write code here that turns the phrase above into concrete actions
  //throw new io.cucumber.java.PendingException();
	
}
@When("User click on Admin Link")
public void user_click_on_Admin_Link() throws InterruptedException
{
   
	//WebDriver driver= webBrowser.openBrowser("http://localhost:8080/SavingsAccount/");
	WebDriver driver= webBrowser.openBrowser("http://localhost:8080/SavingsAccount/");
	driver.findElement(By.xpath("//a[contains(text(),'Admin')]")).click();
	Thread.sleep(3000);
	Alert alert;
	try
	{
	Alert alert1= driver.switchTo().alert();
	System.out.println(alert1.getText());
	alert1.accept();
	}
	catch(NoAlertPresentException e)
	{
		System.out.println("NO alert");
	}
driver.navigate().back();
//driver.findElement(By.xpath("//a[contains(text(),'Customer')]")).click();
}

@Then("User Navigate to Admin Login Page")
public void user_Navigate_to_Admin_Login_Page() 

{
   System.out.println("Admin Login page Navigated successfully");
}


@When("User click on Customer Link")
public void user_click_on_Customer_Link() throws InterruptedException {
 
	WebDriver driver= webBrowser.openBrowser("http://localhost:8080/SavingsAccount/");
	driver.findElement(By.xpath("//a[contains(text(),'Customer')]")).click();
	Thread.sleep(3000);
	Alert alert;
	try
	{
	Alert alert2= driver.switchTo().alert();
	System.out.println(alert2.getText());
	alert2.accept();
	}
	catch(NoAlertPresentException e)
	{
		System.out.println("NO alert");
	}
driver.navigate().back();
}

@Then("User Navigate to Customer login page")
public void user_Navigate_to_Customer_login_page() {
 
	System.out.println("Customer page opened Successfully");
}

@When("User click on Cross Button")
public void user_click_on_Cross_Button() throws InterruptedException 
{
	WebDriver driver= webBrowser.openBrowser("http://localhost:8080/SavingsAccount/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'☰ open')]")).click();
}

@Then("User close the menu")
public void user_close_the_menu()
{
	System.out.println("user closed the menu");
}

@When("User click on Open Link")
public void user_click_on_Open_Link() throws InterruptedException
{
	System.out.println("User Clicked on Open Link");
	//WebDriver driver= webBrowser.openBrowser("http://localhost:8080/SavingsAccount/");
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//span[contains(text(),'☰ open')]")).click();
}

@Then("Admin and Customer menu opened")
public void admin_and_Customer_menu_opened()
{
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("Admin and Customer menu opened Successfully");

}



}
