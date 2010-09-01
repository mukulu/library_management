package library.dao.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import library.dao.UserDAO;
import library.dao.hibernate.util.HibernateUtil;
import library.model.User;

public class HibernateUserDAO implements UserDAO {

	public User getUser(int userId) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getCurrentSession();
		
		User user = (User) session.get(User.class, userId);
		return user;
	}

	public User getUserByFirstLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getCurrentSession();
		String hql = "from User where firstName = :firstName and lastName = :lastName";
		Query query = session.createQuery(hql);
		query.setString(firstName, firstName);
		query.setString(lastName, lastName);
		
		return (User) query.uniqueResult();
	}

	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getCurrentSession();
		
		User user = (User) session.get(User.class, username);
		return user;
	}

	public int saveUser(User user) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		int id = (Integer) session.save(user);
		
		transaction.commit();
		return id;
	}

}
