package net.javaguides.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import net.javaguides.hibernate.model.User;
import net.javaguides.hibernate.util.HibernateUtil;

public class UserDao {

	public void saveUser(User user) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(user);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public boolean validate(String userName, String password) {

		Transaction transaction = null;
		User user = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			String hql = "FROM User U WHERE U.username=:userName";			
			user = (User) session.createQuery(hql).setParameter("userName", userName).uniqueResult();

//			for( int i=0; i< query.list().size(); i++) {
//				User userPrint = (User) query.list().get(i);
//				System.out.println("This is the users firstName" + userPrint.getFirstName().toString());
//			}

			if(user != null && user.getPassword().equals(password)) {
				return true;
			}
			
		} catch (Exception e) {
	
			System.out.println("The Cause" + e.getCause());
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
		} 
		return false;

	}
}