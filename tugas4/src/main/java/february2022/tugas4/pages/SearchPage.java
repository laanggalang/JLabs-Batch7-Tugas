package february2022.tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {
	
	By cari = By.xpath("//input[@id='login']");
	By searchBtn = By.xpath("//i[@class='material-icons-outlined f36']");
	
	public SearchPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public void search(String search1) {
		setText(cari, search1);
		clickAndWait(searchBtn);
	}

}
