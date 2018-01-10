package lexicon.rest;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Loan.class)
public abstract class Loan_ {

	public static volatile SingularAttribute<Loan, Long> LoanID;
	public static volatile SingularAttribute<Loan, LocalDateTime> dateExpire;
	public static volatile SingularAttribute<Loan, LocalDateTime> dateStart;

}

