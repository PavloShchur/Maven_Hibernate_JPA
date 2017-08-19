package shchur_pavlo.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.logging.Logger;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			logger.info(e.toString());
		} finally {
			session.close();
			sessionFactory.close();
		}

	}

}
