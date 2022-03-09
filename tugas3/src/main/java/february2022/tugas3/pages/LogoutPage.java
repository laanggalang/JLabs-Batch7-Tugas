package february2022.tugas3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage extends BasePage {
//	By username = By.xpath("//*[@id=\"username\"]");
//	By password = By.id("password");
//	By loginBtn = By.xpath("//button[@type='submit']");
	By logoutBtn = By.xpath("//i[@class='icon-2x icon-signout']");

	public LogoutPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	public void logout() {
		clickAndWait(logoutBtn);
	}
	
	
	
}
