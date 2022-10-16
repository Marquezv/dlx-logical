package service;

import java.util.List;

import commons.WriteData;
import objects.User;

public class UserService extends WriteData{
	private static final String RESOURCES = "src/main/resources/User.csv";
	WriteData writeData = new WriteData();
	
	public User userWriterCSV(User user) throws Exception{
		List<String[]> line = processUser(user);
		writeData.writeDataLineByLine(RESOURCES, line);
		return user;
	}
	
}
