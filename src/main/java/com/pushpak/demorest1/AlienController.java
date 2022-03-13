package com.pushpak.demorest1;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienController {

	AlienRepo repo = new AlienRepo();
	
	@GET
    @Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien() {
		System.out.println("get aliens");
		return repo.getAliens();
	}
	
	@POST
	@Path(value="alien")
	public Alien createAlien(Alien a1) {
		System.out.println("Objected received\n"+a1);
		repo.create(a1);
		return a1;
	}
	
}
