package OOP_Abstract;

public class TestLoginPage {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();// create the object of Template class to access all the method
		lp.pageLoadTime(); // individual
		lp.page();// override
		lp.title();//override
		
		lp.logo();// inherited
		
		lp.doLogin("admin", "admin123"); // individual
		
		
		//top casting
		// child class object can be ref by parent abs class ref variable.
		
		Page p = new LoginPage();
		p.logo();
		p.title();
		p.pageLoadTime();
		p.page();
		
		
	}

}
