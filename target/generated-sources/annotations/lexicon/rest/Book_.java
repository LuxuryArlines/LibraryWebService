package lexicon.rest;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book.class)
public abstract class Book_ {

	public static volatile SingularAttribute<Book, String> physical_Position;
	public static volatile SingularAttribute<Book, Integer> LendCounter;
	public static volatile SingularAttribute<Book, Long> isbn;
	public static volatile SingularAttribute<Book, String> genre;
	public static volatile SingularAttribute<Book, Long> id;
	public static volatile SingularAttribute<Book, String> title;
	public static volatile SingularAttribute<Book, Boolean> OnLend;

}
