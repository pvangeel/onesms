package aburakc.server;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {

	private EMF() {
		
	}

	private static final EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("au.com.uptick.serendipity");

	public static EntityManagerFactory get() {
		return entityManagerFactory;
	}
}
