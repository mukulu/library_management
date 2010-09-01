package library.dao.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
    private static SessionFactory sessionFactory;
    
    private static Session session;
    
    static
    {
        Configuration configuration = new Configuration();
        
        configuration.configure(); // Loads hibernate.cfg.xml from classpath
        
        sessionFactory = configuration.buildSessionFactory();
        
        session = sessionFactory.openSession();
        
        // No multi-threading considered
    }
    
    public static Session getCurrentSession()
    {
        return session;
    }
}
