package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1 : download and attach chrome driver to this test case
		WebDriverManager.chromedriver().setup();
		// Step 2 : launch the chrome driver
		 ChromeDriver driver = new ChromeDriver();
		 //step 3 : Load the URL
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 // step 4 : maximize the browser
		 driver.manage().window().maximize();
		 // step 5 : to enter user name
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 // step 6 : to enter password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 // step 7 : to click on login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //step 8 : click CRM/SFA
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 // step 9 : click on Contacts tab
		 driver.findElement(By.linkText("Contacts")).click();
		 // step 10 : click on find contacts
		 driver.findElement(By.linkText("Find Contacts")).click();
		 //step 11 : click on Enail
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
		 // step 12 : enter the email address
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("babu@testleaf.com");
		 // step 13 : click on Find contacts
		 driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		 System.out.println("Email has been founded sucessfully");
		 // step 14 : close the browser
		 driver.close();
	}

}
