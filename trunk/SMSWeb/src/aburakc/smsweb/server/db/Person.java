package aburakc.smsweb.server.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Person {
	@Id
	private Long id;
	
	private String name;

	@OneToMany
	private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
	
}
