package com.pushpak.demorest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienController {

	@GET
    @Produces(MediaType.APPLICATION_XML)
	public ArrayList<Alien> getAlien() {
		
		System.out.println("getAlien called");
		
		Alien a1 = new Alien();
		
		a1.setName("Pushpak");
		a1.setPoints(10);
		
		Alien a2 = new Alien();

		a2.setName("Riya");
		a2.setPoints(12);

		return (new ArrayList<Alien>(Arrays.asList(a1,a2)));
	}
}
