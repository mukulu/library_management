package library.client;

import library.dao.UserDAO;
import library.dao.hibernate.HibernateUserDAO;
import library.model.User;

public class UserClient {
	private static UserDAO userDAO;
	static
	{
		userDAO = new HibernateUserDAO();
	}
	public static void main(String[] args) {
		//getUser(2);
		addUser("another","joke","ofmine","hellyeah","simpleenough","gantochodu@gantosemail.com");
	}
	
	private static void getUser(int userId) {
		User user = userDAO.getUser(userId);
		if(user != null ) {
			System.out.println("Username:" + user.getUsername() + "Firstname:" + user.getFirstName() + "Lastname:" + user.getLastName());
		}
		else {
			System.out.println("No match found");
		}
	}
	private static void addUser(String username, String firstName, String lastName) {
		User user = new User();
		user.setUsername(username);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		int id = userDAO.saveUser(user);
		if( id != 0 ) {
			System.out.println("User "+ username + "Added successfully");
		}
		else {
			System.out.println("User couldnot be added");
		}
	}
	private static void addUser(String username, String password, String firstName, String middleName, String lastName, String email) {
		User user = new User();
		user.setUsername(username);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setPassword(password);
		user.setMiddleName(middleName);
		user.setEmail(email);
		int id = userDAO.saveUser(user);
		if( id != 0 ) {
			System.out.println("User "+ username + " Added successfully");
		}
		else {
			System.out.println("User couldnot be added");
		}
	}
}
