package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class accCreat extends DriverSetup {
	static String url = "http://192.168.104.6:7777/CBSTEST/f?p=222";
//	static int userCount = 0;
//	static int count = 1;
	static int accHolder = 0;
	static int loop = 1;

	@Test
	public static void bexibank() throws InterruptedException {
		int i;
		bcl.get(url);
		bcl.manage().window().maximize();
		Thread.sleep(1000);

		// if (count == 1) {
		bcl.findElement(By.id("P101_USER_ID")).sendKeys("ashraf");
		// count += 1; // count=count+1
		// }

		Thread.sleep(1000);
		bcl.findElement(By.id("P101_USER_ID")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		bcl.findElement(By.name("P101_PASSWORD")).sendKeys("ash123");
		Thread.sleep(1000);
		bcl.findElement(By.name("P101_PASSWORD")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		for (i = 1; i < 6; i++) {
			System.out.println(i);
			bcl.findElement(By.xpath("//h3[contains(text(),'Bexi CBS')]")).click();
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//span[@class='a-Icon icon-menu-split-drop-down']")).click();
			Thread.sleep(1000);
			bcl.findElement(By.id("t_MenuNav_0_0i")).click();
			Thread.sleep(1000);
			bcl.findElement(By.id("t_MenuNav_0_0_0i")).click();
			Thread.sleep(1000);
			bcl.findElement(By.name("P279_DOC_NO")).sendKeys("test"); // Document
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//button[@id='B48128393764596407']")).click();
			Thread.sleep(1000);
			Select dropdown = new Select(bcl.findElement(By.id("P6001_NM_TITLE")));
			dropdown.selectByIndex(1);
			Thread.sleep(1000);
//			userCount = userCount + 1;
			accHolder = accHolder + 1;
			 
			if (accHolder < 6) {
				bcl.findElement(By.xpath("//input[@id='P6001_F_NAME']")).sendKeys("Md.Shojib" + accHolder); 
			}

			Thread.sleep(1000);
			bcl.findElement(By.xpath("//button[@id='P6001_SECTOR_CODE_lov_btn']")).click();
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//li[contains(text(),'111000 - Food Ministry (Including Food Division / ')]"))
					.click();
			// bcl.findElement(By.xpath("//li[contains(text(),'111000 - Food Ministry
			// (Including Food Division / ')]")).click();
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//input[@id='P6001_EMAIL_ID']")).sendKeys("jkl@gmail.com");
			Thread.sleep(1000);
			bcl.findElement(By.cssSelector("#P6001_GENDER")).sendKeys("Male");
			Thread.sleep(1000);
			bcl.findElement(By.cssSelector("#P6001_MARITAL_STATUS")).sendKeys("Married");
			Thread.sleep(1000);
			bcl.findElement(By.id("P6001_BIRTH_DATE")).sendKeys("01-Mar-2003"); // BIRTH_DATE
			Thread.sleep(1000);
//		bcl.findElement(By.xpath("//select[@id='P6001_BIRTH_PLACE']")).sendKeys("Mymensingh");
			bcl.findElement(By.cssSelector("#P6001_BIRTH_PLACE")).sendKeys("Mymensingh-61");
			Thread.sleep(1000);
			Select drodow = new Select(bcl.findElement(By.xpath("//select[@id='P6001_RELIGION_CODE']")));
			drodow.selectByIndex(1);
			Thread.sleep(1000);
			// bcl.findElement(By.xpath("//a[contains(text(),'14')]")).click();
			// Thread.sleep(1000);
//		bcl.findElement(By.xpath("//*[@id=\"t_PageBody\"]/div[5]/div[3]/div/button[2]")).click();
			// bcl.findElement(By.xpath("//*[@id=\"t_PageBody\"]/div[5]/div[3]/div/button")).click();
			Thread.sleep(1000);// //*[@id="t_PageBody"]/div[5]/div[3]/div/button
			bcl.findElement(By.xpath("//input[@id='P6001_FATHER_NAME']")).sendKeys("zxc");
			Thread.sleep(1000);

			Select dropdown1 = new Select(bcl.findElement(By.xpath("//select[@id='P6001_FATHER_TITLE']")));
			dropdown1.selectByIndex(1);
			Thread.sleep(1000);
			// #P6001_RELIGION_CODE

//		bcl.findElement(By.xpath("//*[@id=\"B33892974463066085\"]")).click();  
//		Thread.sleep(1000);
			bcl.findElement(By.xpath("//button[@id='B33892974463066085']")).click(); // next #B33892974463066085
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//button[@id='B33921275174066095']")).click(); // add new address
			Thread.sleep(1000);
//		bcl.switchTo().activeElement();
//		Thread.sleep(1000);

//		bcl.switchTo().frame(bcl.findElement(By.cssSelector("iframe[title='Customer Address']")));
			bcl.switchTo().frame(0);
//			bcl.switchTo().frame(bcl.findElement(By.xpath("//iframe[@title='Customer Address']")));

			Select s1 = new Select(bcl.findElement(By.xpath("//select[@id='P6003_ADDR_TYPE']")));
			s1.selectByIndex(1);
			Thread.sleep(1000);

			Select s2 = new Select(bcl.findElement(By.xpath("//select[@id='P6003_RESIDENCE_TYPE']")));
			s2.selectByIndex(3);
			Thread.sleep(1000);

			Select s3 = new Select(bcl.findElement(By.xpath("//select[@id='P6003_STATE_DIV']")));
			s3.selectByIndex(0);
			Thread.sleep(1000);

			Select s4 = new Select(bcl.findElement(By.xpath("//*[@id=\"P6003_CITY_DIST\"]")));
			s4.selectByIndex(9);
			Thread.sleep(1000);
			Select s5 = new Select(bcl.findElement(By.xpath("//*[@id=\"P6003_THANA\"]")));
			s5.selectByIndex(11);
			Thread.sleep(1000);
			Select s6 = new Select(bcl.findElement(By.xpath("//select[@id='P6003_UNION_MAHALLA']")));
			s6.selectByIndex(0);
			Thread.sleep(1000);
			Select s7 = new Select(bcl.findElement(By.xpath("//select[@id='P6003_POSTAL_ZIP']")));
			s7.selectByIndex(0);
			Thread.sleep(1000);

			Select s8 = new Select(bcl.findElement(By.xpath("//select[@id='P6003_VILLAGE_NAME']")));
			s8.selectByIndex(0);
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//*[@id=\"B73533178486760664\"]")).click();
			Thread.sleep(1000);
			bcl.switchTo().defaultContent();
//=============================
			bcl.findElement(By.xpath("//button[@id='B33921275174066095']")).click(); // add new address
			Thread.sleep(1000);

			bcl.switchTo().frame(bcl.findElement(By.xpath("//iframe[@title='Customer Address']")));

			Select s9 = new Select(bcl.findElement(By.xpath("//select[@id='P6003_ADDR_TYPE']")));
			s9.selectByIndex(2);
			Thread.sleep(1000);

			Select s10 = new Select(bcl.findElement(By.xpath("//select[@id='P6003_RESIDENCE_TYPE']")));
			s10.selectByIndex(2);
			Thread.sleep(1000);

			Select s11 = new Select(bcl.findElement(By.xpath("//select[@id='P6003_STATE_DIV']")));
			s11.selectByIndex(5);
			Thread.sleep(1000);

			Select s12 = new Select(bcl.findElement(By.xpath("//*[@id=\"P6003_CITY_DIST\"]")));
			s12.selectByIndex(4);
			Thread.sleep(1000);
			Select s13 = new Select(bcl.findElement(By.xpath("//*[@id=\"P6003_THANA\"]")));
			s13.selectByIndex(2);
			Thread.sleep(1000);
			Select s14 = new Select(bcl.findElement(By.xpath("//select[@id='P6003_UNION_MAHALLA']")));
			s14.selectByIndex(2);
			Thread.sleep(1000);
			Select s15 = new Select(bcl.findElement(By.xpath("//select[@id='P6003_POSTAL_ZIP']")));
			s15.selectByIndex(0);
			Thread.sleep(1000);

			Select s16 = new Select(bcl.findElement(By.xpath("//select[@id='P6003_VILLAGE_NAME']")));
			s16.selectByIndex(0);
//		bcl.findElement(By.xpath("//select[@id='P6003_VILLAGE_NAME']")).sendKeys("beximco");
			Thread.sleep(1000);

			bcl.findElement(By.xpath("//*[@id=\"B73533178486760664\"]")).click(); // Create
			Thread.sleep(1000);

//		bcl.switchTo().activeElement();
			bcl.switchTo().defaultContent();

			bcl.findElement(By.xpath("//button[@id='B33926778342066097']")).click(); // add new Contact No
			Thread.sleep(1000);

			bcl.switchTo().frame(bcl.findElement(By.xpath("//iframe[@title='Customer Contacts']")));

			Select sd = new Select(bcl.findElement(By.xpath("//select[@id='P6004_CONTACT_TYPE']")));
			sd.selectByIndex(0);
			Thread.sleep(1000);
			Select sb = new Select(bcl.findElement(By.xpath("//select[@id='P6004_COM_TYPE']")));
			sb.selectByIndex(1);
			Thread.sleep(1000);
			bcl.findElement(By.id("P6004_CONTACT_NUMBER")).sendKeys("01700111111");
			Thread.sleep(1000);
			Select sf = new Select(bcl.findElement(By.id("P6004_IS_PRIMARY")));
			sf.selectByIndex(0);
			bcl.findElement(By.xpath("//button[@id='B73652884079297924']")).click();
			Thread.sleep(1000);
			bcl.switchTo().defaultContent();

			bcl.findElement(By.xpath("//button[@id='B33933760687066099']")).click(); // Customer Document

			bcl.switchTo().frame(bcl.findElement(By.xpath("//iframe[@title='Customer Document']"))); // Frame In

			bcl.findElement(By.xpath("//input[@id='P6006_DOC_NUMBER']")).sendKeys("gsdgyse");
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//input[@id='P6006_ISSUE_DATE']")).sendKeys("01/02/20");
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//input[@id='P6006_EXPIRY_DATE']")).sendKeys("01/02/22");
			Thread.sleep(1000);
//		Select sv = new Select(bcl.findElement(By.xpath("//select[@id='P6006_ISSUED_BY']")));
//		sf.selectByIndex(0); 
			bcl.findElement(By.xpath("//select[@id='P6006_ISSUED_BY']")).sendKeys("City Corporation");
			Thread.sleep(1000);
			bcl.findElement(By.cssSelector("#B73794197830200003")).click();
			Thread.sleep(1000); // button[@id='B73794197830100003']

			bcl.switchTo().defaultContent();

			bcl.findElement(By.id("B40503910111677201")).click(); // Send for App
			Thread.sleep(1000);

			String cmt = bcl.findElement(By.cssSelector(".t-Alert-title")).getText();
			String id = cmt.substring(cmt.indexOf('(') + 2, cmt.indexOf(')') - 1);
			Thread.sleep(1000);
			System.out.println(id);
			Thread.sleep(1000);

			// Approve CustomerId
			bcl.findElement(By.xpath("//header/div[2]/div[1]/ul[1]/li[4]/span[1]/span[1]")).click();
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//a[@id='t_MenuNav_3_0i']")).click();
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]")).click();
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//*[@id=\"B78855484673579649\"]")).click();
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//*[@id=\"t_PageBody\"]/div[3]/div[3]/div/button[2]")).click();
			Thread.sleep(1000);

			

			System.out.println("Step-2");
			bcl.findElement(By.xpath("//span[@class='a-Icon icon-menu-split-drop-down']")).click();
			Thread.sleep(1000);
			System.out.println("Step-3");
    		bcl.findElement(By.xpath("//button[@id='t_MenuNav_0_1i']")).click();
//			bcl.findElement(By.className("a-Menu-label")).click();
			Thread.sleep(1000);
			System.out.println("Step-4");
			bcl.findElement(By.xpath("//a[@id='t_MenuNav_0_1_0i']")).click();
			Thread.sleep(2000);
			System.out.println("Step-5");
			bcl.findElement(By.xpath("//input[@id='P6021_CUST_ID']")).sendKeys(id);
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//input[@id='P6021_CUST_ID']")).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			bcl.findElement(By.cssSelector("#B31157951233740700")).click();
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//button[@id='B31270041979746624']")).click();
			Thread.sleep(1000);
			bcl.findElement(By.cssSelector("#f04_1")).sendKeys("10");
			Thread.sleep(1000);
			bcl.findElement(By.cssSelector("#f06_1")).sendKeys("10000");
			Thread.sleep(1000);
			bcl.findElement(By.cssSelector("#f05_1")).sendKeys("10000");
			Thread.sleep(1000);
			bcl.findElement(By.cssSelector("#f09_1")).sendKeys("10");
			Thread.sleep(1000);
			bcl.findElement(By.cssSelector("#f10_1")).sendKeys("10000");
			Thread.sleep(1000);
			bcl.findElement(By.cssSelector("#f11_1")).sendKeys("10000");
			((JavascriptExecutor) bcl).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			Thread.sleep(5000);
			bcl.findElement(By.xpath("//button[@id='B31347775065752325']")).click();
			Thread.sleep(1000);
			System.out.println("Step-6");
			String cme1 = bcl.findElement(By.cssSelector(".t-Alert-title")).getText();
			// String aid = cme1.trim()
			String aid = cme1.substring(cme1.indexOf(':') + 1);
			String id1 = aid.trim();
			System.out.println(id1);
			// Acc_Approval
			bcl.findElement(By.xpath(" //header/div[2]/div[1]/ul[1]/li[4]/span[1]/span[1]")).click();
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//a[@id='t_MenuNav_3_1i']")).click();
			Thread.sleep(1000);
			bcl.findElement(By.xpath("//tbody/tr[2]/td[11]/a[1]")).click();
			Thread.sleep(1000);

			bcl.findElement(By.xpath("//button[@id='B59180321420103030']")).click();
			Thread.sleep(1000);

			bcl.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
			Thread.sleep(5000);

			bcl.findElement(By.xpath("//span[contains(text(),'BANGLADESH KRISHI BANK')]")).click();
		}
	}

}
