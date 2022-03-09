package february2022.tugas3;


import org.testng.Assert;
import org.testng.annotations.Test;

import february2022.tugas3.pages.LoginPage;
import february2022.tugas3.pages.LogoutPage;
import february2022.tugas3.pages.ProfilePage;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseWebTest {
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);
	LogoutPage logoutpage = new LogoutPage(driver, explicitWait);

	@Test
	public void test1() {
		// loginpage
		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		loginPage.login(username, password);
		
		//logoutpage
		logoutpage.logout();

		String actualText = loginPage.getLogoutText();

		String expectedText = "You logged out of the secure area";
		System.out.println(actualText);

		// assertion
		Assert.assertTrue(actualText.contains(expectedText));
		
		
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
