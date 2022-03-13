package com.pushpak.demorest1;

import java.util.List;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
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
	
	@GET
	@Path(value="alien/{id}")
    @Produces(MediaType.APPLICATION_XML)
	public Alien getAlien( @PathParam("id") int id) {
		System.out.println("alien/id called\n");
		return repo.getAlien(id);
	}
	
	@POST
	@Path(value="alien")
	public Alien createAlien(Alien a1) {
		System.out.println("Objected received\n"+a1);
		repo.create(a1);
		return a1;
	}
	
}
