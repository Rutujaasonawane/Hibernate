package org.tnsindia.singletable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("Shubham");
		employee.setSalary(55000);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("Shiva");
		manager.setSalary(25000);
		manager.setDepartmentName("Sales");
		em.persist(manager);
		
		//create one employee
				Employee employee1 = new Employee();
				employee1.setName("Sushant");
				employee1.setSalary(45000);
				em.persist(employee1);
				
				//create one manager
				Manager manager1 = new Manager();
				manager1.setName("Shivani");
				manager1.setSalary(30000);
				manager.setDepartmentName("Comp");
				em.persist(manager1);
				
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}
}
