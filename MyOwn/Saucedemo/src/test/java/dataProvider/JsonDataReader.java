package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
import testDataTypes.Users;

public class JsonDataReader {

	ConfigFileReader configFileReader = new ConfigFileReader();
	private final String usersFilePath = configFileReader.getTestDataResourcePath() + "Users.json";
	private List<Users> usersList;

	public JsonDataReader() {
		usersList = getUsersData();
	}

	private List<Users> getUsersData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(usersFilePath));
			Users[] users = gson.fromJson(bufferReader, Users[].class);
			return Arrays.asList(users);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + usersFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public final Users getUsersByName(String userName) {
		//return usersList.stream().filter(x -> x.username.equalsIgnoreCase(userName)).findAny().get();
		for (Users user : usersList) {
			if(user.getUsername().equalsIgnoreCase(userName)) return user;
		}
		return null;
	}

}
