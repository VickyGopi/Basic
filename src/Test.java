import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {


		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver google = new ChromeDriver();
			google.get ("http://leaftaps.com/crmsfa/control/leadsMain");
			String Name = google.getTitle();
			System.out.println(Name);
			google.findElement(By.xpath("//input[@type='text']")).sendKeys("demosalesmanager",Keys.TAB);
			google.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa",Keys.ENTER);
			google.findElement(By.xpath("//a[text()='Find Leads']")).click();
			google.findElement(By.xpath("//label[@for ='ext-gen248']/following::input")).sendKeys("Vignesh");
			 	Thread.sleep(2000);
			google.findElement(By.xpath("//button[text()='Find Leads']")).click();
			google.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10101']")).click();
			google.findElement(By.xpath("//a[@href=\'updateLeadForm?partyId=10101']")).click();
			WebElement name1= google.findElement(By.xpath("//div[text()='Edit Lead']"));
			System.out.println(name1);
			google.findElement(By.xpath("//input[@id ='updateLeadForm_companyName']")).clear();
			google.findElement(By.id("updateLeadForm_companyName")).sendKeys("Cognizant");
			google.findElement(By.className("smallSubmit")).click();
			//WebElement name = google.findElement(By.id("updateLeadForm_companyName"));
			//google.close();
		}

	}