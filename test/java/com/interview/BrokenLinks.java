package com.interview;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	
	List<WebElement> allLinks = driver.findElements(By.tagName("img"));
	int alllinkssize = allLinks.size();
	//System.out.println(alllinkssize);
	for (WebElement listlinks : allLinks) {
		String src = listlinks.getAttribute("src");
		System.out.println(src);
		
//		if (src!=null) {
//			URL url = new URL(src);
//			URLConnection openConnection = url.openConnection();
//			HttpsURLConnection hp = (HttpsURLConnection)openConnection;
//			int code = hp.getResponseCode();
//			System.out.println(code);
//			if (code >= 200) {
//				System.out.println(src);
//			}
//			
//		}
		
	}
	
}
}
