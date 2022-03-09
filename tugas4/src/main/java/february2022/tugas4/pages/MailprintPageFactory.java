package february2022.tugas4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailprintPageFactory extends BasePageFactory {
	
	public MailprintPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	@FindBy(xpath = "//iframe[@id='ifmail']")
	private WebElement printBtn;

	public void clickPrintBtn() {
		printBtn.click();
	}

}
