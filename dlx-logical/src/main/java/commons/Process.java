package commons;

import java.util.List;

import objects.Product;
import objects.Sales;
import objects.User;

public interface Process {
	
	List<String[]> processUser(User user);
	List<String[]> processProduct(Product product);
	List<String[]> processSales(Sales sales);

}
