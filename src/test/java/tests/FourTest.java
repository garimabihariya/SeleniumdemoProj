package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import resources.Base;

public class FourTest extends Base{
	public WebDriver driver;
	@Test
	public void FourTest() throws IOException, InterruptedException {
		System.out.println("FourTest");
		System.out.println("Code changed by garima");
		driver = initializeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(3000);
		Assert.assertTrue(false);
	
	}
	@AfterMethod
	public void ClosingBrowser() {
		driver.close();
	}
	
}
