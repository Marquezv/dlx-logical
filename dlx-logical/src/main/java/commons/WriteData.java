package commons;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

import objects.Product;
import objects.Sales;
import objects.User;

public class WriteData implements Process {
	
	
	public static void writeDataLineByLine(String filePath, List<String[]> lines)
	{
		try {
	        
	        Writer writer = Files.newBufferedWriter(Paths.get(filePath), StandardOpenOption.APPEND);
	        CSVWriter csvWriter = new CSVWriter(writer);
//	    	String[] headers = lines.get(0);
//	        csvWriter.writeNext(headers);
	        csvWriter.writeNext(lines.get(1), true);

	        csvWriter.flush();
	        writer.close();
	        
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	public List<String[]> processUser(User user) {
		String[] headers = {"ID", "NOME", "EMAIL", "SENHA", "STATUS", "PERFIL"};
		String[] line = { user.getId(), user.getNome(), user.getEmail(),  user.getSenha(),
				String.valueOf(user.getStatus()), String.valueOf(user.getPerfil()) };
		List<String[]> arrayUser = new ArrayList<String[]>();
		arrayUser.add(headers);
		arrayUser.add(line);
		return arrayUser;
	}
	
	public List<String[]> processProduct(Product product) {
		String[] headers = {"ID", "NOME", "VALOR", "DESCRICAO", "QUANTIDADE", "DONO", "ID_DONO"};
		String[] line = { product.getId(), product.getNome(), String.valueOf(product.getValor()), 
				String.valueOf(product.getDescricao()), String.valueOf(product.getQuantidade()), 
				product.getDono().getNome(), product.getDono().getId() };
		List<String[]> arrayProduct = new ArrayList<String[]>();
		arrayProduct.add(headers);
		arrayProduct.add(line);
		return arrayProduct;
	}
	
	public List<String[]> processSales(Sales sales) {
		String[] headers = {"ID", "DONO", "PRODUCT_ID", "PRODUCT_NOME", "PRODUCT_VALOR",
				"USER_ID", "USER_NOME", "USER_EMAIL", "TOTAL"};
		String[] line = { sales.getId(), sales.getProduct().getId(), sales.getProduct().getNome(),
				sales.getUser().getNome(), String.valueOf(sales.getProduct().getValor()),
				sales.getUser().getId(), sales.getUser().getNome(), sales.getUser().getNome(), sales.getUser().getEmail(), 
				String.valueOf(sales.getTotal())};
		List<String[]> arraySales = new ArrayList<String[]>();
		arraySales.add(headers);
		arraySales.add(line);
		return arraySales;
	}

	

}
