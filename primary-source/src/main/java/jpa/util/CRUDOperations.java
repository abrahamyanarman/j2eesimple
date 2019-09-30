package jpa.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class CRUDOperations {


    protected static SessionFactory sessionFactory = JpaUtil.getSessionFactory();

    public static void insertEntity( Object o) {
        Session session = null;
        try{
            session = sessionFactory.openSession();


           session.beginTransaction();
           session.save(o);

           session.getTransaction().commit();

       }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }

    }

    public static  <T> T  findEntitybyId(Class<T> var1,int id) {
        Session session = null;
        Object o = null;
        try {
             session = sessionFactory.openSession();

            session.beginTransaction();
             o = session.find(var1,id);

            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }

        return (T)o;
    }

    public static  <T> T  findEntitybyUserName(String username) {
        Session session = null;
        Object o = null;
        try {
             session = sessionFactory.openSession();

            session.beginTransaction();
             o = session.createQuery("from User u where u.username = :username").setParameter("username", username).getSingleResult();


            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }


        return (T) o;
    }

    public static void updateEntity(Object o) {
        Session session = null;
        try{
            session = sessionFactory.openSession();

            session.beginTransaction();
            session.update(o);

            session.getTransaction().commit();

        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }



    }

    public static void removeEntity( Object o) {
        Session session = null;
        try{
            session = sessionFactory.openSession();

            session.beginTransaction();
            session.remove(o);

            session.getTransaction().commit();

        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }


    }
}
