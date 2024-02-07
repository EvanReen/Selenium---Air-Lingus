package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChannelPage {
	
	private WebDriver driver;
	
	//constructor
	public ChannelPage(WebDriver driver) {
		this.driver=driver;	
		
	}
	
	By pgaTourChannelButton = By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-watch-flexy[1]/div[5]/div[1]/div[1]/div[2]/ytd-watch-metadata[1]/div[1]/div[2]/div[1]/div[1]/ytd-subscribe-button-renderer[1]/yt-smartimation[1]/div[1]/__slot-el[1]/yt-button-shape[1]/button[1]/yt-touch-feedback-shape[1]/div[1]/div[2]");
	
	By SignIn = By.xpath("/html[1]/body[1]/ytd-app[1]/ytd-popup-container[1]/tp-yt-iron-dropdown[1]/div[1]/ytd-modal-with-title-and-button-renderer[1]/div[1]/ytd-button-renderer[1]/yt-button-shape[1]/a[1]/yt-touch-feedback-shape[1]/div[1]/div[2]");
	
	By pgaTourChannel = By.xpath("//div[@id='upload-info']//a[@class='yt-simple-endpoint style-scope yt-formatted-string'][normalize-space()='PGA TOUR']");
	
	
	public void gotToChannel() {
		
		// Find the PGA Tour channel element
		WebElement pgaTourChannelElement = driver.findElement(pgaTourChannel);

		// Check if the element is displayed
		if (pgaTourChannelElement.isDisplayed()) {
		    System.out.println("PGA Tour channel is displayed");
		  } else {
		    System.out.println("PGA Tour channel is not displayed");
		  }
		
		
		driver.findElement(pgaTourChannelButton).click();
		
		//implicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(SignIn).click();
		
		// Wait 5 seconds to allow the page to load fully
        try {
        	
        	Thread.sleep(5000);
        	
        } catch (InterruptedException e) {
        	e.printStackTrace();
        	
        }
		
	}
}
