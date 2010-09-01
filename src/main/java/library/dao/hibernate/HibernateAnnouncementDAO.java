package library.dao.hibernate;

import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import library.dao.AnnouncementDAO;
import library.dao.hibernate.util.HibernateUtil;
import library.model.Announcement;

public class HibernateAnnouncementDAO implements AnnouncementDAO {

	public Announcement getAnnouncement(int announcementId) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getCurrentSession();
        
        return (Announcement) session.get( Announcement.class, announcementId );
	}

	public Announcement getAnnouncement(String title) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getCurrentSession();
		
		String hql = "from Announcement where title = :title";
		
		Query query = session.createQuery(hql);
		
		query.setString("title", title);
		
		return (Announcement) query.uniqueResult();
	}

	public Announcement getAnnouncement(Date datePosted) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getCurrentSession();
		
        String hql = "from Announcement where datePosted = :datePosted";
        
        Query query = session.createQuery( hql );
        
        query.setDate( "datePosted", datePosted );
        
        return (Announcement) query.uniqueResult();
	}

	public int saveAnnouncement(Announcement announcement) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getCurrentSession();
        
        Transaction transaction = session.beginTransaction();
        
        int id = (Integer) session.save( announcement );
        
        transaction.commit(); // No error handling considered
        
        return id;
	}

}
