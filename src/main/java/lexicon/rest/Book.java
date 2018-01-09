package lexicon.rest;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book implements BookInterface {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	//@NaturalId
	private String ISBN;
	private String Title;
	private String Location_Shelf;
	private boolean OnLend;
	private int LendCounter;
	@Override
	public void createBook(Book book) {
		
	}
	@Override
	public List<Book> listBooks() {
	
		return null;
	}
	@Override
	public List<Book> searchByTitle(String title) {
		
		return null;
	}
	
}
