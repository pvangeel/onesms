package aburakc.server;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import aburakc.shared.db.Message;

public class MessageDAO {
	public static final EntityManager entityManager() {
		return EMF.get().createEntityManager();
	}
	
	public void saveMessage(Message message){
		EntityManager entityManager = entityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();
			entityManager.persist(message);
			entityManager.flush();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			entityManager.close();
		}


	}
}
