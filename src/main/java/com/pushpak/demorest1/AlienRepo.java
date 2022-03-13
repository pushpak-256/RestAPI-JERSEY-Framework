package com.pushpak.demorest1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AlienRepo {

	List<Alien> aliens;

	public AlienRepo() {
		
		Alien a1 = new Alien();

		a1.setId(1);
		a1.setName("Pushpak");
		a1.setPoints(10);

		Alien a2 = new Alien();

		a2.setId(2);
		a2.setName("Riya");
		a2.setPoints(12);
		
		aliens =new LinkedList<Alien>(Arrays.asList(a1,a2));
	}
	
	//multiple Aliens
	public List<Alien> getAliens() {
		return this.aliens;
	}
	
	//one alien 
	public Alien getAlien(int primaryKey) {
		
		for (Alien a : aliens) {
			if (a.getId()==primaryKey)
				return a;
		}
		System.out.println("no Alien found for id "+primaryKey);
		return null;
	}

	public void create(Alien a1) {
		aliens.add(a1);
	}
	
}
