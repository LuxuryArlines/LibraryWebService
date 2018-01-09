package lexicon.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	//@NaturalId
	private String ISBN;
	private String Title;
	private String Location_Shelf;
	private boolean OnLend;
	private int LendCounter;
	
}
