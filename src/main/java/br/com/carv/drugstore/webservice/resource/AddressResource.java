package br.com.carv.drugstore.webservice.resource;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import br.com.carv.drugstore.webservice.response.AddressResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/zip-query")
@Produces(MediaType.APPLICATION_JSON)
public class AddressResource {
	
	@GET
	@Path("/{cep}")
	public AddressResponse getAddressByCep(@PathParam("cep") String cep) {
		ResteasyClient resteasyClient = (ResteasyClient) ResteasyClientBuilder.newClient(); 
		ResteasyWebTarget resteasyWebTarget = resteasyClient.target(String.format("https://viacep.com.br/ws/%s/json", cep));	
		
		Response response = resteasyWebTarget.request(MediaType.APPLICATION_JSON).get();
		AddressResponse address = (AddressResponse) response.getEntity();
		return address;
	}

}
