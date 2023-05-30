package seleniumlaunch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://leaftaps.com/opentaps/control/login");
		Driver.findElement(By.id("username")).sendKeys("demosalesManager");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.linkText("CRM/SFA")).click();
		Driver.findElement(By.partialLinkText("Create Lead")).click();
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthika");
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("nav");
		Driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("K");
		Driver.findElement(By.name("departmentName")).sendKeys("Chemical");
		Driver.findElement(By.id("createLeadForm_description")).sendKeys("Need more practice");
		Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("21Karthika@gmail.com");
		WebElement state = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select=new Select(state);
		select.selectByValue("NY");
		Driver.findElement(By.className("smallSubmit")).click();
		Driver.findElement(By.linkText("Edit")).click();
		Driver.findElement(By.id("updateLeadForm_description")).clear();
		Driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Keep practice, you will get it there");
		Driver.findElement(By.name("submitButton")).click();
		Driver.close();
				
		// TODO Auto-generated method stub

	}

}
