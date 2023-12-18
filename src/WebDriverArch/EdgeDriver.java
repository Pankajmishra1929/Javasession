package WebDriverArch;

public class EdgeDriver implements WebDriver{
	
	public EdgeDriver() {// Constructor 
		System.out.println("launch the edge browser...");
	}
	
	@Override
	public void findElement(String locator) {
		System.out.println("Finding elements----" + locator);
		
	}

	@Override
	public void click(String locator) {
		System.out.println("click on----" + locator);
		
	}

	@Override
	public void sedKeys(String locator, String value) {
		System.out.println("enter value----:" + locator + "value=" + value);
		
	}

	@Override
	public String getTitle() {
		return "Amazon";
		
	}

	@Override
	public void get(String url) {
		System.out.println("enter the url--"+ url);
		
	}

	@Override
	public void close() {
		System.out.println("close the browser...");
		
	}

	
}



