package february2022.tugas3;

import org.testng.Assert;
import org.testng.annotations.Test;

import february2022.tugas3.pages.LoginPageFactory;
import february2022.tugas3.pages.LogoutPagefactory;
//import february2022.tugas3.pages.ProfilePageFactory;

/**
 * Unit test for simple App.
 */
public class AppTestPageFactory extends BaseWebTest {

	@Test
	public void test1() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
//		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		LogoutPagefactory logoutPagefactory = new LogoutPagefactory(driver, explicitWait);

		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginBtn();
		logoutPagefactory.clicklogoutBtn();
		String actualText = loginPage.getLogoutText();
		String expectedText = "You logged out of the secure area";
		System.out.println(actualText);
		Assert.assertTrue(actualText.contains(expectedText));
	}

//	@Test
//	public void test2() {
//		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
//		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
//
//		String username = "tomsmith";
//		String password = "SuperWrongPassword";
//
//		loginPage.inputUsername(username);
//		loginPage.inputPassword(password);
//		loginPage.clickLoginBtn();
//		String actualText = profilePage.getProfileText();
//		String expectedText = "Your password is invalid";
//		System.out.println(actualText);
//		Assert.assertTrue(actualText.contains(expectedText));
//	}

}
