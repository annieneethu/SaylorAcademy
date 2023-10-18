package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
protected WebDriver driver;
	
	@BeforeMethod
	public void bmethod() {
	driver=new ChromeDriver();
	driver.get("https://learn.saylor.org/");
	driver.manage().window().maximize();
	}
}
