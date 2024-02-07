package pageObjects;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	//constructor
	public HomePage(WebDriver driver) {
		this.driver=driver;	
		
	}
	
	//encapsulation
	By AcceptCookiesButton = By.xpath("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]");
	
	By search = By.xpath("//input[@id='search']");
	
	By searchButton = By.cssSelector("button[id='search-icon-legacy'] yt-icon[class='style-scope ytd-searchbox'] div");
	
	
	//method to accept cookies pop up
	public void acceptCookies() {
		
		driver.findElement(AcceptCookiesButton).click();
		
		// Wait 5 seconds to allow the page to load fully
        try {
        	
        	Thread.sleep(5000);
        	
        } catch (InterruptedException e) {
        	e.printStackTrace();
        	
        }
	}
	
	//method to search for video
	public void searchVideo() {
		
		//assertion to see if the url contains youtube 
		String currentUrl = driver.getCurrentUrl();
		
		if(currentUrl.contains("youtube")) {
			
			System.out.println("This is the Youtube Home Page");
		}else {
			System.out.println("Couldn't find the word youtube in the url");
		}
		
		driver.findElement(search).click();
		
		//implicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(search).sendKeys("Tiger Woods best golf shots");
	
		//implicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(searchButton).click();
		
		// Wait 5 seconds to allow the second page to load fully
        try {
        	
        	Thread.sleep(5000);
        	
        } catch (InterruptedException e) {
        	e.printStackTrace();
        	
        }
		
		
	}
	
	

}
