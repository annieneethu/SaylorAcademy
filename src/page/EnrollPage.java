package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnrollPage {
WebDriver driver;
	
	By enroll =By.xpath("//*[@id=\"main-enroll-button\"]/a");
	By enrollme =By.xpath("//*[@id=\"id_submitbutton\"]");
	
	public EnrollPage(WebDriver driver) {
		this.driver=driver;
	}

	public void enrolling() {
		driver.findElement(enroll).click();
		driver.findElement(enrollme).click();
	}
}
