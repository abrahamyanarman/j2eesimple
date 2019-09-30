package jpa.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class JpaUtil {


    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = buildSessionFactory();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    static SessionFactory buildSessionFactory() throws ClassNotFoundException {
        // Class.forName("oracle.jdbc.driver.OracleDriver");
       /* Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");*/
        sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static boolean isConnected(){
        try{
            boolean isConnected = getSessionFactory().openSession().isConnected();
            return isConnected;
        }catch (Exception  e){
            e.printStackTrace();
        }
         return false;
    }
}
