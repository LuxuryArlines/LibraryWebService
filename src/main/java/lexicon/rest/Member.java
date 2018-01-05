package lexicon.rest;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Mark this class as a Entity
@Entity
public class Member implements Serializable {
	
	//Mark this field as primary key
	//and let the database generate the key
	@Id
	@GeneratedValue	
	private int id;
	private String firstName;
	private String lastName;	
	
	//JPA requires empty constructor
	public Member() {
		
	}
	
	public Member(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName + lastName;
	}

}
