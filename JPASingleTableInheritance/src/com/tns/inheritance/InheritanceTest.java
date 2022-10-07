package com.tns.inheritance;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.entities.Manager;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		/*
		 * Employee emp1=new Employee(); emp1.setName("Gayatri"); emp1.setSalary(10000);
		 * 
		 * em.persist(emp1);
		 */
		
		
		Manager manager1=new Manager();
		manager1.setName("Vikas");
		manager1.setSalary(100000);
		manager1.setDepartmentName("C2TC");
		em.persist(manager1);
		em.getTransaction().commit();
		System.out.println("Added one employee and manager to database.");
		}

}
