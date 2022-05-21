package selenium.week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 WebElement elemFirst = driver.findElement(By.id("username"));
		 elemFirst.sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manisha");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kamal");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Manisha");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("The description is tested");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("manishakamalakkannan@gmail.com");
			WebElement drop=	 driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select dropdown=new Select(drop);
			dropdown.selectByIndex(2);
			
			WebElement drop1=	 driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select dropdown1=new Select(drop1);
			dropdown1.selectByVisibleText("New York");
	

		driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.linkText("Edit")).click();
			 driver.findElement(By.id("updateLeadForm_description")).clear();
			 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Filled the notes");
			 driver.findElement(By.name("submitButton")).click();
			 System.out.println("Tile :" + driver.getTitle());

}
}
