package OOP_Encapsulation;

public class Browser {

	public void launchBrowser(){// have to access launch browser. Other method not required to show the user.
		//Make the other method private
		//Method encapsulation
		// Public method can access the private method within the class
		System.out.println("Browser is launching---");
		checkRam();
		cpuUtilization();
		checkBrowserVersion();
		System.out.println("Browser Launched---");
		
				
	}
	
	private void checkRam(){
		System.out.println("checkRam---");
		
	}
	private void cpuUtilization(){
		System.out.println("cpuUtilization---");
	}
	private void checkBrowserVersion(){
		System.out.println("checkBrowserVersion---");
	}
	
	
	
	
	
//	public static void main(String[] args) {
//		
//	
//	}

}
