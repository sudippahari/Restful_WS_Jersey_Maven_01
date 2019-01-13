package com.sudip.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/greeting")
public class Message {

	@Path("{name}")
	@GET
	public String getGreeting(@PathParam("name") String name) {
		return "Thank you for visiting this site Mr. " + name;
	}

	@Path("add/{a}/{b}")
	@GET
	public String add(@PathParam("a") int a, @PathParam("b") int b) {
		return Integer.toString(a + b);
	}
}
