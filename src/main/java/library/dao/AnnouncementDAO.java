package library.dao;

import java.util.Date;

import library.model.Announcement;

public interface AnnouncementDAO {
	int saveAnnouncement(Announcement announcement);
	
	Announcement getAnnouncement(int announcementId);
	
	Announcement getAnnouncement(String title);
	
	Announcement getAnnouncement(Date datePosted);
}
