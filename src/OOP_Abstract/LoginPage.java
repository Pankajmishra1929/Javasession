package OOP_Abstract;

public class LoginPage extends Page{

	@Override
	public void title() {
		System.out.println("Print title---");
		
	}

	@Override
	public void page() {
		System.out.println("login page logo");
		
	}

    @Override
	public void pageLoadTime() {
		System.out.println("Login page load time out ---2 sec");
	}
	
//    Final method can't override
//	public final void logo() {
//		System.out.println(" Login page App logo");
//	}
	
	public void doLogin(String un,String pwd) {
		System.out.println("logged in with user" +" " + un + " "+ pwd);
		
	}
}
