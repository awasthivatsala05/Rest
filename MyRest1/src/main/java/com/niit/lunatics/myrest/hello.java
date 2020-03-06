package com.niit.lunatics.myrest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class hello {

	 @GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String sayPlainTextHello() {
	        return "hello jersey Plain";
	    }
	 @GET
	 @Path("/xmlhello")
	 @Produces(MediaType.TEXT_XML)
	 public String sayXMLHello() {
		 return "<?xml version=\"1.0\"?>"+"<hello> Hello Jersey"+"</hello>";
	 }
	 @GET
	 @Path("/htmlhello")
	 @Produces(MediaType.TEXT_HTML)
	 public String sayHTMLHello() {
		 return "<HTML>"+"<TITLE>"+"Hello Jersey"+"</TITLE>"+"<BODY><H1>"+"Hello Jersey HTML"+"</H1></BODY>"+"</HTML";
	 }
}
