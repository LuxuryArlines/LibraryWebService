package lexicon.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@Stateless
public class MemberEJB {

	//Injects a entitymanager to handle entities.
	//The entityManager will scan persistence.xml
	//to figure out the database configuration.
	@Inject
	EntityManager em;
	
	public void createMember(Member member) {
		//Calling entityManager to persist entity
		em.persist(member);
	}


 
	public List<Member> listMembers() {
		//Using JPQL to query database
		  TypedQuery<Member> query =
			      em.createQuery("SELECT m FROM Member m", Member.class);
			   List<Member> results = query.getResultList();
			   return results;
	}



	public List<Member> searchByLastName(String name) {
		//Using JPQL to query database
		  TypedQuery<Member> query =
			      em.createQuery("SELECT m FROM Member m WHERE m.lastName= :replace", Member.class);
		  		query.setParameter("replace", name);
			   List<Member> member = query.getResultList();
			   return member;
		
	}
		
}
