package com.tns.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.entities.Address;
import com.tns.entities.Student;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setName("Aditya");
		
		Address homeAddress = new Address();
		
		homeAddress.setStreet("RSC 132");
		homeAddress.setCity("Mumbai");
		homeAddress.setState("Maharashtra");
		homeAddress.setZipCode("400064");
		
		//inject address into student
		student.setAddress(homeAddress);
		
		//persist only student, no need to persist Address explicitly
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		/*
		 * em.close(); factory.close();
		 */
	}
	

}
