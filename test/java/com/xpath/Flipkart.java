package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043916!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=CjwKCAjww8mWBhABEiwAl6-2RQONoFfSbGZZPBoP53YgBPSNF-RYkvHHHiHnzKDoj6iHpWzPRSUQZRoCXkQQAvD_BwE");
		driver.manage().window().maximize();
		WebElement txtsearch = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		txtsearch.sendKeys("iphone 13");
		WebElement btnsearch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		
	}
}
