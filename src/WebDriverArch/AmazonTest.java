package WebDriverArch;

public class AmazonTest {
	
	static WebDriver driver;// in case we do not create it as static to call this need to create object.
	// to avoid unnecessary creation of object use static
	// by creating static we can directly call it by class name

	public static void main(String[] args) {
		
		//chrome
		//ChromeDriver driver = new ChromeDriver();
		
		//firefox:
		//FirefoxDriver driver = new FirefoxDriver();
		
		String browser= "IE";  // When pass wrong browser it through Null pointer exception
		
		switch(browser.toLowerCase().trim()) {
		
		case "chrome":
			AmazonTest.driver= new ChromeDriver();// top costing
		break;
		
		case "firefox":
			AmazonTest.driver= new FirefoxDriver();
			break;
			
		case "edge":
			AmazonTest.driver= new EdgeDriver();
			break;
			
			default:
				System.out.println("Please pass the right browser name--" + browser);
			break;
			
			
			}
		
	    
		
	    driver.get("https://www.amazon.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement("emailid");
		driver.findElement("password");
	     
		driver.sedKeys("emailid", "admin@gmail.com");
		driver.sedKeys("password", "admin@123");
		driver.click("loginbutton");
		
		driver.close();
		
		

	}

}
