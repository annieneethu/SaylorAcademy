package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CoursePage {
	WebDriver driver;

	By courses=By.xpath("//*[@id=\"page-wrapper\"]/nav/ul[1]/li[1]/a");
	By art =By.xpath("//*[@id=\"frontpage-category-combo\"]/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[1]/a");
	
	public CoursePage(WebDriver driver) {
		this.driver=driver;
	}

	public void courseclick() {
		driver.findElement(courses).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,450)","");
		
		driver.findElement(art).click();
	}	
}
