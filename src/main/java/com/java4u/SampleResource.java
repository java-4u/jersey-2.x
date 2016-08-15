package com.java4u;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;

@Path("sample")
public class SampleResource {
	static Logger log = Logger.getLogger(SampleResource.class.getName());

	@GET
	@Path("text")
	@Produces(MediaType.TEXT_PLAIN)
	public Response showText() {
		log.info("called show()");
		return Response.ok(Status.OK).entity("Sample Text Response").build();
	}

	@GET
	@Path("html")
	@Produces(MediaType.TEXT_HTML)
	public Response showHtml() {
		log.info("called showHtml()");
		String data = "<h1>Sample HTML Response</h1>";
		return Response.ok(Status.OK).entity(data).build();
	}

	@GET
	@Path("xml")
	@Produces({ MediaType.APPLICATION_XML, MediaType.TEXT_XML })
	public Response showXml() {
		log.info("called showXml()");
		SamplePresenter presenter = new SamplePresenter("Sample XML Response");
		return Response.ok(Status.OK).entity(presenter).build();
	}

	@GET
	@Path("json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response showJson() {
		log.info("called showJson()");
		SamplePresenter presenter = new SamplePresenter("Sample XML Response");
		return Response.ok(Status.OK).entity(presenter).build();
	}
}
