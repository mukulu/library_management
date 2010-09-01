package library.model;

import java.util.Date;

public class User {
	int userId;
	private String username;
	private String password;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String permission;
	private Date dateJoined;
	private Date lastLogin;
	
	public User() {
		
	}
	public User(int userId) {
		this.userId = userId;
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	//Sets methods
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public void setDateJoined(Date dateJoined) {
		this.dateJoined = dateJoined;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	//Gets methods
	public int getUserId() {
		return userId;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPermission() {
		return permission;
	}
	public Date getDateJoined() {
		return dateJoined;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
}
