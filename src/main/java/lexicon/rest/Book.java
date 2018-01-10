package lexicon.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book
//implements BookInterface 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	//@NaturalId
	private long isbn;
	private String title;
	private String physical_Position;
	private String genre;
	
	private boolean OnLend;
	private int LendCounter;
	
	public Book() {
	}
	
	public Book(long isbn,String title) {
		this.isbn= isbn;
		this.title=title;
	}

	public Long getId() {
		return id;
	}

	
	public long getISBN() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhysical_Position() {
		return physical_Position;
	}

	public void setPhysical_Position(String physical_Position) {
		this.physical_Position = physical_Position;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean isOnLend() {
		return OnLend;
	}

	public void setOnLend(boolean onLend) {
		OnLend = onLend;
	}

	public int getLendCounter() {
		return LendCounter;
	}

	public void setLendCounter(int lendCounter) {
		LendCounter = lendCounter;
	}
	
//	@Override
//	public void createBook(Book book) {
//		
//	}
//	@Override
//	public List<Book> listBooks() {
//	
//		return null;
//	}
//	@Override
//	public List<Book> searchByTitle(String title) {
//		
//		return null;
//	}
	
}
