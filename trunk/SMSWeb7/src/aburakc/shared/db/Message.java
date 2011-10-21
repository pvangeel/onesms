package aburakc.shared.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Message {
	
	@Id
	@GeneratedValue
	private	Long id;
	
	private String message;
	
	@OneToOne
	private Person person;

	private Boolean incoming;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Boolean getIncoming() {
		return incoming;
	}

	public void setIncoming(Boolean incoming) {
		this.incoming = incoming;
	}
}
