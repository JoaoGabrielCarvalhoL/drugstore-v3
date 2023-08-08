package br.com.carv.drugstore.webservice.resource;

import org.jboss.logging.Logger;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import br.com.carv.drugstore.webservice.response.AddressResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;

@Path("/query")

public class AddressResource {
	
	private final Logger logger = Logger.getLogger(AddressResource.class.getName());
	
	@GET
	@Path("/{cep}")
	@Produces(MediaType.APPLICATION_JSON)
	public AddressResponse getAddressByCep(@PathParam("cep") String cep) {
		logger.info("Getting Address by Cep: " + cep);
		ResteasyClient resteasyClient = (ResteasyClient) ResteasyClientBuilder.newClient(); 
		ResteasyWebTarget resteasyWebTarget = resteasyClient.target(String.format("https://viacep.com.br/ws/%s/json", cep));
		
		Response response = resteasyWebTarget.request(MediaType.APPLICATION_JSON).get();
		int status = response.getStatus();
		logger.info("Http Status Code: " + status);
		MultivaluedMap<String,Object> headers = response.getHeaders();
		System.out.println(headers.toString());
		String jsonData = response.readEntity(String.class);
		System.out.println(jsonData);
		AddressResponse addressResponse = response.readEntity(AddressResponse.class);//is closed.
		return addressResponse;
	}

}

//http://127.0.0.1:8080/Drugstore/zip/query/19930086

/*
 * Response response = resteasyWebTarget.request().get();
		int status = response.getStatus();
		logger.info("Http Status Code: " + status);
		AddressResponse address = response.readEntity(AddressResponse.class);
		response.close();
		return address;*/
