package OOP_Abstract;

public abstract class Page {// to create abstract class use abstract keyword

	
		// can not have an object
		//class can have abs method or non abs method
	
	public abstract void title();// abstract key need to define in abstract class
	public abstract void page();
	
	public void pageLoadTime() {
		System.out.println("page load time out ---10 sec");
	}
	
	public final  void logo() {
		System.out.println("App logo");
	}
	
	
	
}
