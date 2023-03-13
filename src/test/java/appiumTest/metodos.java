package appiumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class metodos {
	
	By clickChrome = By.xpath("//android.widget.TextView[@content-desc='Chrome']");
	
	public boolean clickChrome(WebDriver driver) throws InterruptedException {
		boolean resultado = true;
		Thread.sleep(1000);
		driver.findElement(clickChrome).click();
		return resultado;
	}

}
