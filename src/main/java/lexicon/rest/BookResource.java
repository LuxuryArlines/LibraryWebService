package lexicon.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

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
@Path("/book")
public class BookResource {
	
	//Inject a EJB to handle database logic
	@Inject
	BookInterface bookService;
	
	//Mark this method to handle GET requests
	//and defines the content type.
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getBook() {
		return Response.ok(bookService.listBooks()).build();
	}
	
	//Mark this method to handle POST requests
	//and defines the content type.
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createBook(Book book) throws URISyntaxException {
		bookService.createBook(book);
		return Response.created(new URI("localhost:8080/jboss-javaee-webapp/rest/book")).build();
	}
	
	//Mark this method to handle GET requests on /lastName
	//and defines the content type.
	@GET
	@Path("/isbn")
	@Produces(MediaType.APPLICATION_JSON)
	public Response printName(@QueryParam("isbn") String title) {
		List<Book> book = bookService.searchByTitle(title);
		return Response.ok(book).build();
	}
	
}
