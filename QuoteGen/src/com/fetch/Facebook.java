package com.fetch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.restfb.BinaryAttachment;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import com.restfb.types.User;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Facebook {
	//static WebDriver driver=null;
	public static void main(String[] args) throws IOException
	{
		Fetch f=new Fetch();
		//f.fetchQuote();
		TextToImage.convert(f.fetchQuote());
	     
		String accessToken="EAACEdEose0cBAK6aPAMunzbltQZAh4BXA5aZAVdQJZCaZAo6ne1fGylbXGpAC9eLlZCuupmM9v1zNRCZCsRgDfqb2BtF0Y1AI1AHZCQnC5P2kPicKZCZCKUuom136bBZBYyLkpZCZBUJ3CHvDR0vpbxBMD2qfo4bX7ZCUZAoPZCiExqvTzoq0LzocxhVtJBH3eiNPfZCyKKLzVqrNtJPQmeLZC2bUwLEK";
				FacebookClient fbClient= new DefaultFacebookClient(accessToken);
		
		FileInputStream fis= new FileInputStream(new File("Quote.png"));
		
		FacebookType response= fbClient.publish("me/photos", FacebookType.class, BinaryAttachment.with("Quote.png", fis)
				, Parameter.with("message", "DAILY QUOTE")); 
		
		User me= fbClient.fetchObject("me", User.class);
		
		System.out.println("fb.com/"+response.getId());
		String fbURL= "fb.com/"+response.getId();
		
		
		//URL url = new URL(fbURL);
		//HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		//connection.setRequestMethod("POST");
		//connection.connect();

		//int code = connection.getResponseCode();
		
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get(fbURL);
		
		
		//FirefoxOptions options = new FirefoxOptions();
		//options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine
 
		//FirefoxDriver driver = new FirefoxDriver(options);
		//driver.get(fbURL);
		
		
		//final FirefoxProfile firefoxProfile = new FirefoxProfile();
	    //firefoxProfile.setPreference("xpinstall.signatures.required", false);
	    //driver = new FirefoxDriver(firefoxProfile);
	    //driver.get(fbURL);
		
		System.out.println(me.getName());
		
	}
	
	
	
}
