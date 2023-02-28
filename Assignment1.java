package SeleniumHome;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("xyz");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ganesh");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nandhiniganesh96@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234545678");
		driver.findElement(By.name("submitButton")).click();
		
		

	}

}
