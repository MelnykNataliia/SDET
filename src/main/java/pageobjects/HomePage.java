package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	By search = By.xpath("//input[@id='suggestion-search']");
	By searchButton = By.xpath("//button[@id='suggestion-search-button']");
	By searchResult = By.xpath("//section[2]/div[2]/ul[1]/li[1]");
	By description = By.xpath("//p[@class='sc-5f699a2-3 lopbTB']");
	By firstMovie = By.xpath("//a[normalize-space()='1985']");

	// Check the page is opened
	public void checkIfThePageIsOpened() {
		String expectedTitle = "IMDb";

		if (driver.getTitle() != null && driver.getTitle().contains(expectedTitle)) {
			System.out.println("The web page is opened");
		} else {
			System.out.println("The web page could not open");
		}
	}

	// Search the movie by title "Back to the future" and open its page
	public void searchByTitle() {
		driver.findElement(search).sendKeys("Back to the future");
		driver.findElement(searchButton).click();
		driver.findElement(searchResult).click();

		if ((driver.findElement(firstMovie).getText().contains("1985"))) {
			System.out.println("This is the first part of a trilogy, released in 1985");
		}
	}

	// Check the movie description
	public void checkDescription() {
		String expectedDescription = "Marty McFly, a 17-year-old high school student, is accidentally " +
				"sent thirty years into the past in a time-traveling DeLorean invented by his close friend," +
				" the eccentric scientist Doc Brown.";

		if ((driver.findElement(description).getText()).equals(expectedDescription)) {
			System.out.println("The expected description matches the actual description");
		} else {
			System.out.println("Failed! The expected description does not match the actual description");
		}
	}
}
