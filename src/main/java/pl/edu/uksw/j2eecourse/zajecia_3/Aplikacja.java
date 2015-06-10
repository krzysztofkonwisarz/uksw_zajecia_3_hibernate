package pl.edu.uksw.j2eecourse.zajecia_3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Aplikacja {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Drzewo drzewo = new Drzewo();
        session.save(drzewo);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

}
