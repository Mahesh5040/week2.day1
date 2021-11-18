package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v95.browser.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Assignment1 {

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
				 // step 10 : click on create create contact
				 driver.findElement(By.linkText("Create Contact")).click();
				 // step 11 : to enter First Name
				 driver.findElement(By.id("firstNameField")).sendKeys("Mahesh");
				 // step 12 : to enter last name
				 driver.findElement(By.id("lastNameField")).sendKeys("Raju");
				 // step 14 : click on create contact
				driver.findElement(By.name("submitButton")).click();
				//step 15: check the page title
				String title = driver.getTitle();
				System.out.println(title);
				// step 16 : verify the contact name
				 String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
				 System.out.println(text);
				// step 17 : to close the browser
				 driver.close();
				 
	}

}
