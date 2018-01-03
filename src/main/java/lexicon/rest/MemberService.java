package lexicon.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


//The path to the rest service
@Path("/member")
@RequestScoped
public class MemberService {
	
	//Inject a EJB to handle database logic
	@Inject
	MemberEJB memberService;
	
	//Mark this method to handle GET requests
	//and defines the content type.
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMember() {
		return Response.ok(memberService.listMembers()).build();
	}
	
	//Mark this method to handle POST requests
	//and defines the content type.
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createPeson(Member member) throws URISyntaxException {
		memberService.createMember(member);
		return Response.created(new URI("localhost:8080/jboss-javaee-webapp/rest/person")).build();
	}
	
	//Mark this method to handle GET requests on /lastName
	//and defines the content type.
	@GET
	@Path("/lastName")
	@Produces(MediaType.APPLICATION_JSON)
	public Response printName(@QueryParam("name") String name) {
		List<Member> person = memberService.searchByLastName(name);
		return Response.ok(person).build();
	}
	
}
