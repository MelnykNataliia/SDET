package tests;

import config.ChromeDriverConfiguration;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.BasePage;
import pageobjects.HomePage;

public class Task extends ChromeDriverConfiguration {
	protected WebDriver driver = ChromeDriverConfiguration.createDriver();
	protected BasePage basePage = new BasePage(driver);
	protected HomePage homePage = new HomePage(driver);

	@Test
	public void searchMovieByTitle() {
		String url = "https://www.imdb.com/";

		basePage.open(url);
		homePage.checkIfThePageIsOpened();
		homePage.searchByTitle();
		homePage.checkDescription();
		basePage.close();

		/*
		Test failed: actual result ≠ expected result

		Expected: "Marty McFly, a 17-year-old high school student, is accidentally sent thirty years into the past
		in a time-traveling DeLorean invented by his close friend, the eccentric scientist Doc Brown."

     	but was: "Marty McFly, a 17-year-old high school student, is accidentally sent 30 years into the past
     	in a time-traveling DeLorean invented by his close friend, the maverick scientist Doc Brown."
		 */
	}
}

