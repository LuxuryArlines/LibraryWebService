package lexicon.rest;

import java.util.List;

public interface MemberInterface {

	void createMember(Member member);

	List<Member> listMembers();

	List<Member> searchByLastName(String name);

}