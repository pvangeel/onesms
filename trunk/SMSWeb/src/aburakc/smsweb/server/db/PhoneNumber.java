package aburakc.smsweb.server.db;

import javax.persistence.Id;

public class PhoneNumber {
	@Id
	private Long id;
	private String type;
	private String number;
	
}
