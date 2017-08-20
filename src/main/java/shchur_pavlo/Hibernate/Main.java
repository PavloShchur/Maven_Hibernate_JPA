package shchur_pavlo.Hibernate;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import shchur_pavlo.models.Citizen;
import shchur_pavlo.models.Nationality;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
//		List<Object[]> citizens = null;
		List<Object[]> citizens = null;
		List<Citizen> citizens1 = new ArrayList<Citizen>();

		try {
			session.beginTransaction();

//			SQLQuery sqlQueryUpdate = (SQLQuery) session.
//					createSQLQuery("UPDATE Citizen SET nameOfCitizen = :name WHERE id = :id")
//					.setParameter("name", "First")
//					.setParameter("id", 1);
//			sqlQueryUpdate.executeUpdate();
//
//
//			SQLQuery sqlQueryResult = session.
//	createSQLQuery("SELECT {c.*}, {n.*} FROM Citizen c JOIN Nationality n ON c.nationality_id=n.id")
//					.addEntity("c", Citizen.class)
//					.addJoin("n", "c.nationality");
//			System.out.println("S = " + sqlQueryResult.list());
//			citizens = sqlQueryResult.list();

//			Query query = session.
//					createQuery("FROM Citizen AS c INNER JOIN c.nationality AS n WITH n.id = 1");
//					createQuery("FROM Citizen");
//					createQuery("SELECT c FROM Citizen AS c INNER JOIN c.nationality AS n WITH n.id = :id")
//					.setParameter("id", 1L);
//			citizens1 = query.list();

			Citizen citizen = new Citizen("SAVE");
			session.save(citizen);

			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			logger.info(e.toString());
		} finally {
			session.close();
			sessionFactory.close();
		}

//		for(Object[] row : citizens){
//			System.out.println(row[0].toString() + ((Nationality)row[1]).getTypeOfNationality());
//		}

		System.out.println(citizens1);

//		for (Object obj[] : citizens) {
//			System.out.println(obj[0].toString() + ((Nationality)obj[1]).getTypeOfNationality());
//			}
	}
}




















