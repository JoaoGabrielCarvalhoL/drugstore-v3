package br.com.carv.drugstore.webservice.resource;

import java.util.HashSet;
import java.util.Set;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/zip")
public class AddressApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	
	public AddressApplication() {
		singletons.add(new AddressResource());
	}
	
	@Override
	public Set<Object> getSingletons() {
		return this.singletons;
	}
}
