import objects.Product;
import objects.Sales;
import objects.User;
import service.ProductService;
import service.SalesService;
import service.UserService;

public class MainApplication {
	
//	private final String id;
//	private final Product product;
//	private final User user;
//	private final double total;
	
	public static void main(final String[] args) throws Exception{
		User user = new User("123-user", "Vini", "senha", "email@email.com", true, 3);
		Product product = new Product("123-product", "Lampada", 19.90,"Lampadas LED 100w", 4, user);
		Sales sales = new Sales("123-sales", product, user, product.getValor());
		
		UserService userService = new UserService();
		ProductService productService = new ProductService();
		SalesService salesService = new SalesService();
		
		userService.userWriterCSV(user);
		productService.productWriterCSV(product);
		salesService.salesWriterCSV(sales);
	}
	
}