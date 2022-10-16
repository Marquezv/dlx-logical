package service;

import java.util.List;

import commons.WriteData;
import objects.Sales;

public class SalesService extends WriteData{
	private static final String RESOURCES = "src/main/resources/Sales.csv";

	public Sales salesWriterCSV(Sales sales) throws Exception {
		List<String[]> line = processSales(sales);
		WriteData.writeDataLineByLine(RESOURCES, line);
		return sales;
	}
	
}
