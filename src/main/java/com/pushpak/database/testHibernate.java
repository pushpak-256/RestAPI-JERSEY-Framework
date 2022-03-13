package com.pushpak.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pushpak.demorest1.Alien;

public class testHibernate {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		System.out.println(session.isConnected());
		session.beginTransaction().commit();
	}
	
}
