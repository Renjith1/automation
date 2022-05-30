package org.bank;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Locator  {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MY COMPUTER\\eclipse-workspace\\BankDetails\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//pass url
		driver.get("https://letcode.in/table");
// click element
		driver.findElement(By.id("testing")).click(); // id click
// get text header
		String text = driver.findElement(By.tagName("h1")).getText(); // tag
		System.out.println("test is;" + text);
//get text
		String text2 = driver.findElement(By.linkText("Sign up")).getText(); // link text

		System.out.println(text2);
//get text
		String text3 = driver.findElement(By.linkText("Log in")).getText();
		System.out.println(text3);
//get text
		WebElement element = driver.findElement(By.tagName("app-menu"));
		System.out.println(element.getText());

// click to frame                              text
		driver.findElement(By.xpath("//a[.='Inner HTML']")).click();
//switch to frame
		driver.switchTo().frame("firstFr");
//enter  first name
		driver.findElement(By.name("fname")).sendKeys("renjith");
// enter last name
		driver.findElement(By.name("lname")).sendKeys("ronaldo");
// switch to inner frame
		driver.switchTo().frame(1);
// enter mail
		driver.findElement(By.name("email")).sendKeys("renjithsing10@gmail.com");
// get out frame
		driver.switchTo().defaultContent();

// click workspace

		driver.findElement(By.id("testing")).click();

//click drag &  drop
		driver.findElement(By.linkText("AUI - 2")).click();
		Actions a = new Actions(driver);

		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		a.dragAndDrop(drag, drop);

//click work space
		driver.findElement(By.id("testing")).click();

// click select
		driver.findElement(By.linkText("Drop-Down")).click();

// click fruits
		WebElement ddown = driver.findElement(By.id("fruits"));

// drop down single select

		Select s = new Select(ddown);

		s.selectByVisibleText("Apple");
		s.selectByValue("0");
		s.selectByIndex(3);

		List<WebElement> allitems = s.getAllSelectedOptions();
		int size = allitems.size();
		System.out.println(size);

// drop down multiselect

		WebElement dddown = driver.findElement(By.id("superheros"));
		Select d = new Select(dddown);
		d.selectByVisibleText("The Avengers");
		d.selectByValue("bw");
		d.selectByVisibleText("Captain America");
		d.selectByVisibleText("Captain Marvel");
// is multiple
		boolean multiple = d.isMultiple();
		System.out.println(multiple);

		List<WebElement> heros = d.getAllSelectedOptions();
		int size2 = heros.size();
		System.out.println(size2);

// driver.close
		driver.close();

	}
}
