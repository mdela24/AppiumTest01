package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class setup {
	WebDriver driver;
//	AppiumDriver<MobileElement> driver;
	
	@Before
	public void setupAppium() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("noReset", true);
//		cap.setCapability("app","C:\\apk\\OrangeHRM Advanced_4194504_Apkpure.apk");
		cap.setCapability("noSign", true);
		cap.setCapability("autoGrantPermissions", true);
		URL url  = new URL("http://127.0.0.1:4723/wd/hub");
		driver= new RemoteWebDriver (url, cap);
//		driver= new AppiumDriver<MobileElement> (url, cap);
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@Test
	public void testCall() throws InterruptedException {
		boolean resultado = true;
		metodos met = new metodos();
		resultado= met.clickChrome(driver);
	}

}
