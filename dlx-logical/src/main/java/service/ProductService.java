package service;

import java.util.List;

import commons.WriteData;
import objects.Product;

public class ProductService extends WriteData{
	private static final String RESOURCES = "src/main/resources/Product.csv";
	WriteData writeData = new WriteData();

	public Product productWriterCSV(Product product) throws Exception {
		List<String[]> line = processProduct(product);
		writeData.writeDataLineByLine(RESOURCES, line);
		return product;
	}
	
}
