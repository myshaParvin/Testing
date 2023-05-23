import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PlaceOrder {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\BatteryLow\\Testing study\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://sindabad.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("My Cart")).click();
		
		driver.findElement(By.linkText("here")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("cat-title-slog")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("ACI Pure Salt, 1kg")).findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[5]/ol/li[1]/div/div/div[2]/div/div[1]/form/button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("counter-number")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("otp_mobile")).sendKeys("01684223960");
		
		
		driver.findElement(By.cssSelector("#tab-mobile > div.actions-toolbar > div:nth-child(1) > button")).click();
		Thread.sleep(15000);
		
		
		driver.findElement(By.xpath("//*[@id=\"tab-mobile\"]/div[3]/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ONI2M6R")).sendKeys("13");
		
		Thread.sleep(2000);
				
		Select city = new Select(driver.findElement(By.id("WUWW0XG")));
					
		city.selectByVisibleText("Dhaka");
		
		Thread.sleep(2000);
		
		Select area = new Select(driver.findElement(By.id("QQIYT5B")));
					
		area.selectByVisibleText("Banani");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
		
		driver.findElement(By.id("cashondelivery")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();
		
		
		
	}

}
