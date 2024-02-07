package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ChannelPage;
import pageObjects.HomePage;
import pageObjects.VideoPage;

public class YoutubeTest {
	
	private WebDriver driver;

    @BeforeTest
    public void setUp() {

        driver = new ChromeDriver();
    }
    
    @Test
    public void testSearchVideo() {
        
    	driver.get("https://www.youtube.com/");
        
        //Mazimize current window
		driver.manage().window().maximize();
		
		
        HomePage homepage = new HomePage(driver);
        homepage.acceptCookies();
		homepage.searchVideo();
		
		
		VideoPage videoPage= new VideoPage(driver);
        videoPage.clickVideo();
        
        
        ChannelPage channel = new ChannelPage(driver);
        channel.gotToChannel();
       
    }
    
    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
