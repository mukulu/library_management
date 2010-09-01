package library.dao;

import library.model.User;

public interface UserDAO {
	int saveUser(User user);
	
	User getUser(int userId);
	
	User getUserByUsername(String username);
	
	User getUserByFirstLastName(String firstName, String lastName);
}
