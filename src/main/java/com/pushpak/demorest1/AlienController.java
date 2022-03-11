package com.pushpak.demorest1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienController {

	@GET
    @Produces(MediaType.APPLICATION_XML)
	public Alien getAlien() {
		
		System.out.println("getAlien called");
		
		Alien a1 = new Alien();
		
		a1.setName("Pushpak");
		a1.setPoints(10);
		
		return a1;
	}
}
