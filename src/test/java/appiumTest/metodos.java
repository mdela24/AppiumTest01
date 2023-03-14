package appiumTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class metodos {
	
//	By clickChrome = By.xpath("//android.widget.TextView[@content-desc='Chrome']");
//	
//	public boolean clickChrome(WebDriver driver) throws InterruptedException {
//		boolean resultado = true;
//		Thread.sleep(1000);
//		driver.findElement(clickChrome).click();
//		return resultado;
//	}
	
    By inputUsuario = By.xpath("//input[@name='username']");
    By inputpassword = By.xpath("//input[@name='password']");
    By btnLogin = By.xpath("//form[@class='oxd-form']/div[@class='oxd-form-actions orangehrm-login-action']/button");
    By messageError_Login = By.xpath("//p[contains(.,'Invalid credentials')]");
    String mesaggeErrorL= "Invalid credentials";

    
	public boolean loginUsuario(WebDriver driver, String Usuario) {
		boolean resultado = true;
		try {
			WebElement usuario= driver.findElement(inputUsuario);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(190));
			wait.until(ExpectedConditions.visibilityOf(usuario));
			usuario.sendKeys(Usuario);
		} catch (Exception e) {
			System.out.println("El metodo ha fallado debido a :" +e);
		}
		return resultado;
	}

	public boolean loginPassword(WebDriver driver, String pass) {	
		boolean resultado = true;
		try {
			WebElement password= driver.findElement(inputpassword);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(190));
			wait.until(ExpectedConditions.visibilityOf(password));
			password.sendKeys(pass);
		} catch (Exception e) {
			System.out.println("El metodo ha fallado debido a :" +e);
		}
		return resultado;
	}

	public boolean clickBtn_login(WebDriver driver) {
		boolean resultado= true;
		try {
            WebElement btn = driver.findElement(btnLogin);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(190));
			wait.until(ExpectedConditions.elementToBeClickable(btn));
			List<WebElement> allFormChildElements = driver.findElements(btnLogin);
			for (WebElement item : allFormChildElements) {
				item.click();
			}
		} catch (Exception e) {
			System.out.println("El metodo ha fallado debido a :" +e);
		}	
		return resultado;
	}


	

}
