package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	 
	 By profileclick= By.xpath("//*[@id=\"action-menu-toggle-1\"]");
	 By dboard=By.xpath("//*[@id=\"actionmenuaction-1\"]");
	 
	 
	 public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}


	public void dashboard() {
			driver.findElement(profileclick).click();
			driver.findElement(dboard).click();
		}
}
