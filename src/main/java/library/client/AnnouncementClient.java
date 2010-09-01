package library.client;

import library.dao.AnnouncementDAO;
import library.dao.UserDAO;
import library.dao.hibernate.HibernateAnnouncementDAO;
import library.dao.hibernate.HibernateUserDAO;
import library.model.Announcement;
import library.model.User;

public class AnnouncementClient {
	private static AnnouncementDAO announcementDAO;
	private static UserDAO userDAO;
	static 
	{
		announcementDAO = new HibernateAnnouncementDAO();
		userDAO = new HibernateUserDAO();
	}
	public static void main(String[] args) {
		addAnnouncement();
		//getAnnouncements();
	}
	public static void getAnnouncements() {
		String title = "Second Announcement";
		Announcement announcement = announcementDAO.getAnnouncement(title);
		if( announcement == null ) {
			System.out.println("No results found!");
		}
		else {
			System.out.println("title:" + announcement.getTitle() + " body:" +
					announcement.getBody());
		}
	}
	public static void addAnnouncement() {
		Announcement announcement = new Announcement();
		//announcement.setAnnouncementId(1);
		announcement.setTitle("Good stuff Announcement");
		announcement.setBody("Body of the text");
		User author = new User();
		author = userDAO.getUser(1);
		announcement.setAuthor(author);
		announcementDAO.saveAnnouncement(announcement);
		System.out.println("Announcement:" + announcement.getTitle() + announcement.getBody());
	}
	
}
