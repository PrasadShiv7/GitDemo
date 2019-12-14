package Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {

	//scope of the webdriver will be to all the class 
	public WebDriver driver;
	
	public WebDriver initializedriver() throws IOException
	{
		//only one method should be responsible for creating any browser driver
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("E:\\eclipse\\E2ETesting\\src\\main\\java\\Testing\\data.properties");
		
		
		//properties files is responsible for reading data from file
		//a method called prop object prop.load which takes an argumnet and reads the data
		
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		System.out.println(browsername);
		
		if(browsername.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","E:\\eclipse\\Selenium Project\\cdr79\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			
		}
		else if(browsername.equals("firefox"))
		{
			//firefox driver call
		}
		else
		{
			//other browser driver call
		}
		
		
		//Time out for issue reporting if any element is not found
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//returing the webdriver from this class which can be used in other class
		return driver;
	}
	

}
