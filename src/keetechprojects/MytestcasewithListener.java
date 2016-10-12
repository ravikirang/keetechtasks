package keetechprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(keetechprojects.TestNGListner.class)
public class MytestcasewithListener {
	
	
	
	@Test
	
	public void Googletitleverify() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
