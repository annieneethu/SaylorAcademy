package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	WebDriver driver;

	By login= By.xpath("//*[@id=\"page-wrapper\"]/nav/ul[2]/li[2]/div/span/a");
	By name =By.id("username");
	By pass =By.id("password");
	By log =By.id("loginbtn");

	public SignUpPage(WebDriver driver) {
		this.driver=driver;
	}

	public void logs() {
		driver.findElement(login).click();
	}

	public void clicksign(String username, String password ) {
		driver.findElement(name).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(log).click();
	 }
}
