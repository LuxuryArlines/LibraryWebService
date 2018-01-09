package lexicon.rest;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;




//Mark this class as a Entity
@Entity
public class Member implements Serializable {
	
	//Mark this field as primary key
	//and let the database generate the key
	@Id
	@GeneratedValue	
	private long memberId;
	private String firstName;
	private String lastName;
	private String emailAdress;
	
	@OneToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn ( name="memberId")
	private List<Loan> loans;
	
	public List<Loan> getLoans() {
		return loans;
	}
	//JPA requires empty constructor
	public Member() {
		
	}
	
	public Member(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	public long getId() {
		return memberId;
	}


	public void setId(long id) {
		this.memberId = id;
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
