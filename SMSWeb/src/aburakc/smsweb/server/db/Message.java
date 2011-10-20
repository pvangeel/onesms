package aburakc.smsweb.server.db;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



public class Message {
	@Id
	private Long id;
	
	private String message;
	
	@ManyToOne
	private Person person;
}
