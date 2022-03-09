package february2022.tugas4;


import org.testng.Assert;
import org.testng.annotations.Test;

import february2022.tugas4.pages.MailprintPage;
import february2022.tugas4.pages.SearchPage;
//import february2022.tugas4.pages.SearchPage;


/**
 * Unit test for simple App.
 */
public class AppTest extends BaseWebTest {

	SearchPage searchPage = new SearchPage(driver, explicitWait);
	MailprintPage mailprintPage = new MailprintPage(driver, explicitWait);
	
	@Test
	public void test1() {
		//search page
		String cari = "automation";
		
		searchPage.search(cari);
		
		mailprintPage.cetak();
	}
	
//	@Test
//	public void test2() {
//		String username = "tomsmith";
//		String password = "SuperWrongPassword";
//
//		driver.get().findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
//		driver.get().findElement(By.id("password")).sendKeys(password);
//		driver.get().findElement(By.xpath("//button[@type='submit']")).click();
//		String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
//		String expectedText = "Your password is invalid";
//		System.out.println(actualText);
//		Assert.assertTrue(actualText.contains(expectedText));
//	}

}
