package basicProjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BaseMethods {
	
	public static final By userName = By.xpath("/html/body/div/div/div/div/main/div/div[2]/form/div[1]/input");
	public static final By password = By.xpath("/html/body/div/div/div/div/main/div/div[2]/form/div[2]/input");
	public static final By loginButton = By.xpath("/html/body/div/div/div/div/main/div/div[2]/form/input");
	public static final By firstBox = By.xpath("/html/body/div[5]/div/div/div[3]/div/form/p[2]/input[1]");
	public static final By secondBox = By.xpath("/html/body/div[5]/div/div/div[3]/div/form/p[2]/input[2]");
	
	public void loginEServices(WebDriver x) {
		x.findElement(userName).sendKeys("kg8051on");
		x.findElement(password).sendKeys("Wakeboard6!!!");
		x.findElement(loginButton).click();
	}
	
	public void checkBox(WebDriver x) {
		x.findElement(firstBox).click();
		x.findElement(secondBox).click();
	}
}
