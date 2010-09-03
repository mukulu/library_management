package library.dao.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Properties;

public class HibernateUtil
{
    private static SessionFactory sessionFactory;
    
    private static Session session;
    
    static
    {
        Configuration configuration = new Configuration();
        
        configuration.configure(); // Loads hibernate.cfg.xml from classpath
        
        // Sets postgres configurations
        Properties postgresProperties = new Properties();
        postgresProperties.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        postgresProperties.setProperty("hibernate.connection.url", "jdbc:postgresql:library_management");
        postgresProperties.setProperty("hibernate.connection.username", "mukulu");
        postgresProperties.setProperty("hibernate.connection.password", "panda");
        postgresProperties.setProperty("dialect", "org.hibernate.dialect.PostgreSQLDialect");
        postgresProperties.setProperty("hibernate.connection.pool_size", "50");
        
        // Sets Mysql configurations
        Properties mysqlProperties = new Properties();
        mysqlProperties.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        mysqlProperties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/library_management");
        mysqlProperties.setProperty("hibernate.connection.username", "root");
        mysqlProperties.setProperty("hibernate.connection.password", "root");
        mysqlProperties.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
        mysqlProperties.setProperty("hibernate.connection.pool_size", "50");
        
        
        
        // Uses postgres database;
        configuration.setProperties(mysqlProperties);
        sessionFactory = configuration.buildSessionFactory();
        
        session = sessionFactory.openSession();
        
        // No multi-threading considered
    }
    
    public static Session getCurrentSession()
    {
        return session;
    }
}
