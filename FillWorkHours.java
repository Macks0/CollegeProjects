package basicProjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillWorkHours {
		
	public static void main(String[] args) {
		
		System.setProperty( 
	            "webdriver.chrome.driver", 
	            "C:\\Users\\maxes\\eclipse-workspace\\SeleniumProjects\\src\\drivers\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.mnsu.edu/eservices/");
		BaseMethods eServices = new BaseMethods();
		eServices.loginEServices(driver);
		eServices.checkBox(driver);
		
		driver.close();
		
	}
}
