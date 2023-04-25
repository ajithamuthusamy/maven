package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentSparkReporter reporter=new ExtentSparkReporter("reporter.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
	ExtentTest test=	extent.createTest("google");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http:\\www.google.co.in");
		WebElement search=driver.findElement(By.name("q"));
		search.submit();
		test.pass("testpassed");
		test.log(Status.INFO, "testpassed");
		driver.quit();
		extent.flush();
		

	}

}
