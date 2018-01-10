package lexicon.rest;

import java.util.List;

public interface BookInterface {
	
	void createBook(Book book);

	List<Book> listBooks();

	List<Book> searchByTitle(String title);

}