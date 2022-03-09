package february2022.tugas3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageFactory extends BasePageFactory {
	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//div[@id='flash']")
	private WebElement logoutText;

	public LoginPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void inputUsername(String user) {
		username.sendKeys(user);
	}

	public void inputPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}
	public String getLogoutText() {
		return logoutText.getText();
	}

}
