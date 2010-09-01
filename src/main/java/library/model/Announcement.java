package library.model;

import java.util.Date;

public class Announcement {
	private int announcementId;
	private String title;
	private String body;
	private Date datePosted;
	private User author;
	
	public Announcement() {
		
	}
	public Announcement(int announcementId) {
		this.announcementId = announcementId;
	}
	public Announcement(int announcementId, String title, String body) {
		this.announcementId = announcementId;
		this.title = title;
		this.body = body;
	}
	public Announcement(int announcementId, String title, String body, Date datePosted) {
		this.announcementId = announcementId;
		this.title = title;
		this.body = body;
		this.datePosted = datePosted;
	}
	
	//	Sets methods
	public void setAnnouncementId(int announcementId) {
		this.announcementId = announcementId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public void setDatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	
	// Get methods
	public int getAnnouncementId() {
		return announcementId;
	}
	public String getTitle() {
		return title;
	}
	public String getBody() {
		return body;
	}
	public Date getDatePosted() {
		return datePosted;
	}
	public User getAuthor() {
		return author;
	}
}
