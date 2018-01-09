package lexicon.rest;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Loan {
	@Id
	@GeneratedValue
	private Long LoanID;
	private LocalDateTime dateStart;
	private LocalDateTime dateExpire;
	
}
