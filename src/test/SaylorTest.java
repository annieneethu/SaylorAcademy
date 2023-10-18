package test;

import org.testng.annotations.Test;

import base.Baseclass;
import page.CoursePage;
import page.DashboardPage;
import page.EnrollPage;
import page.SignUpPage;

public class SaylorTest extends Baseclass {
	@Test
	public void test() {
		
		SignUpPage ob1= new SignUpPage(driver);
		ob1.logs();
		ob1.clicksign("anamikajosh" ,"anamikajosh@2023");
		
		CoursePage ob2=new CoursePage(driver);
		ob2.courseclick();
		
		EnrollPage ob3=new EnrollPage(driver);
		ob3.enrolling();
		
		DashboardPage ob4=new DashboardPage(driver);
		ob4.dashboard();
	}
}
