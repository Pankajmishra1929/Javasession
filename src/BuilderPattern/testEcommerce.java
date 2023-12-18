package BuilderPattern;

public class testEcommerce {

	public static void main(String[] args) {
		
		Ecommerce u1 = new Ecommerce();
		u1.userLogin("admin123", "admin@123")
		   .searchProduct("laptop")
		    .selectProduct("macbook")
		     .addToCart("macbook")
		       .doPayment("1213", 3232)
		        .generateOrderId(123131)
		          .logout();
	}

}
