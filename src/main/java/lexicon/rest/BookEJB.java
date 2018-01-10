package lexicon.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@Stateless
public class BookEJB implements BookInterface {

	// Injects a entitymanager to handle entities.
	// The entityManager will scan persistence.xml
	// to figure out the database configuration.
	@Inject
	EntityManager em;

	/*
	 * (non-Javadoc)
	 * 
	 * @see lexicon.rest.MemberInterface#createMember(lexicon.rest.Member)
	 */
	@Override
	public void createBook(Book book) {
		// Calling entityManager to persist entity
		em.persist(book);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see lexicon.rest.MemberInterface#listMembers()
	 */
	@Override
	public List<Book> listBooks() {
		// Using JPQL to query database
		TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b", Book.class);
		List<Book> results = query.getResultList();
		return results;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see lexicon.rest.MemberInterface#searchByLastName(java.lang.String)
	 */
	@Override
	public List<Book> searchByTitle(String title) {
		// Using JPQL to query database
		TypedQuery<Book> query = em.createQuery("SELECT b FROM Book m WHERE title = :replace", Book.class);
		query.setParameter("replace", title);
		List<Book> book = query.getResultList();
		return book;

	}

	
}
