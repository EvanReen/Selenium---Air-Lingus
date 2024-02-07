package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VideoPage {
	
	private WebDriver driver;
	
	//constructor
	public VideoPage(WebDriver driver) {
		this.driver=driver;	
		
	}
	
	By searchBar = By.xpath("//input[@id='search']");
	
	By video = By.xpath("//body/ytd-app/div[@id='content']/ytd-page-manager[@id='page-manager']/ytd-search[@role='main']/div[@id='container']/ytd-two-column-search-results-renderer[@class='style-scope ytd-search']/div[@id='primary']/ytd-section-list-renderer[@class='style-scope ytd-two-column-search-results-renderer']/div[@id='contents']/ytd-item-section-renderer[@class='style-scope ytd-section-list-renderer']/div[@id='contents']/ytd-video-renderer[1]/div[1]/div[1]/div[2]");
	
	
	public void clickVideo() {
		
		// Wait 5 seconds to allow the page to load fully
        try {
        	
        	Thread.sleep(5000);
        	
        } catch (InterruptedException e) {
        	e.printStackTrace();
        	
        }
        
        // Check if the search bar contains the expected text
        String searchBarText = driver.findElement(searchBar).getAttribute("value");
        
        if(searchBarText.contains("Tiger Woods best golf shots")) {
        	System.out.println("Search bar contains the words - Tiger Woods best golf shots");
        }else {
        	System.out.println("Search bar does not contain the words - Tiger Woods best golf shots");
        }

        
        driver.findElement(video).click();
        
        //implicitWait
      	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
    	
	}

}
