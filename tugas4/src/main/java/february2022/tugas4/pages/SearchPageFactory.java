package february2022.tugas4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageFactory extends BasePageFactory {
	public SearchPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	@FindBy(xpath = "//input[@id='login']")
	private WebElement cari;

	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
	private WebElement searchBtn;

	public void inputSearch(String search1) {
		cari.sendKeys(search1);
	}

	public void clickSearchBtn() {
		searchBtn.click();
	}

}
