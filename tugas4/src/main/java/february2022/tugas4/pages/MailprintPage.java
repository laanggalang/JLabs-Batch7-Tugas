package february2022.tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailprintPage extends BasePage{
	public MailprintPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	By printBtn = By.xpath("//iframe[@id='ifmail']");
	
	public void cetak() {
		clickAndWait(printBtn);
	}
	
}
