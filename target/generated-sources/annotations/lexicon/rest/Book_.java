package lexicon.rest;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book.class)
public abstract class Book_ {

	public static volatile SingularAttribute<Book, String> ISBN;
	public static volatile SingularAttribute<Book, Integer> LendCounter;
	public static volatile SingularAttribute<Book, String> Title;
	public static volatile SingularAttribute<Book, String> Location_Shelf;
	public static volatile SingularAttribute<Book, Long> id;
	public static volatile SingularAttribute<Book, Boolean> OnLend;

}

