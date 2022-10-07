package com.tns.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.entities.Employee;
import com.tns.entities.Manager;
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("John");
		employee.setSalary(5000);
		em.persist(employee);
		
		//create one manager
		Manager manager3 = new Manager();
		manager3.setName("Abhishek");
		manager3.setSalary(9000);
		manager3.setDepartmentName("Dev");
		em.persist(manager3);
			
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		//em.close();
		//factory.close();
	}

}
