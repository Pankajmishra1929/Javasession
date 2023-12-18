package BuilderPattern;

public class Ecommerce {
	public Ecommerce userLogin()	{
		System.out.println("user logged in");
		return this;// this keyword returning the current class object
		
	}
	
	
	public Ecommerce userLogin(String un, String pwd)	{
		System.out.println("user logged in with =" + un + "=" + pwd);
		return this;
		
	}
	
	public Ecommerce searchProduct(String productName) {
		System.out.println("Search product="+ productName );
		return this;
		
	}
	
	
	public Ecommerce searchProduct(String productName, String color) {
		System.out.println("Search product="+ productName + " =" + color);
		return this;
	}
	
	public Ecommerce selectProduct(String productName) {
		System.out.println("Selecting Product " + productName);
		return this;
	}
	
	public Ecommerce addToCart(String productName) {
		System.out.println("Adding Product into the cart " + productName);
		return this;
	}
	
	public Ecommerce doPayment(String cc, int cvv) {
		System.out.println("doing payment " + cc + cvv);
		return this;
	}
	
	public Ecommerce generateOrderId(int id) {
		System.out.println("Generating order " + id);
		return this;
	}
	
	public Ecommerce logout() {
		System.out.println("logout from the syatem");
		return this;
	}
}
