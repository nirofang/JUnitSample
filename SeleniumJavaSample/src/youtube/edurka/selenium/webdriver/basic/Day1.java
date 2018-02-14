package youtube.edurka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	private JavascriptExecutor jse;
	public void invokeBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\zheng\\Test\\selenium\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.edureka.co/");
			
			searchCourse();
			
//			driver.close();
//			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void searchCourse()
	{
		try {
			driver.findElement(By.id("homeSearchBar")).sendKeys("java");
			Thread.sleep(3000);
			driver.findElement(By.id("homeSearchBar")).sendKeys(Keys.ENTER);
		

			driver.findElement(By.xpath("/html/body/div[4]/div[6]/section/article/div[2]/div[1]/div[2]/div/div[2]/div/button")).click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//label/input[@type='checkbox' and @class='check4 weekendfilter batch_category_select']")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[6]/section/article/div[2]/div[1]/div[2]/div/div[2]/div/ul/li[1]/a/label/div")).click();
			
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 1000)");
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	WebDriver driver;
	public static void main(String[] args) {
		Day1 myObj = new Day1();
		myObj.invokeBrowser();

	}

}
