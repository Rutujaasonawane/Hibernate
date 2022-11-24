package org.tnsindia.onetooneunidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirection {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s=new Student();
		s.setStudentName("Rutuja");
		
		Student s1=new Student();
		s1.setStudentName("Sushant");
		
		Address a=new Address();
		a.setAddressId(101);
		a.setStreet("Magarpatta");
		a.setCity("Pune");
		a.setState("Maharashtra");
		
		Address a1=new Address();
		a1.setAddressId(111);
		a1.setStreet("Hinjawadi");
		a1.setCity("Pune");
		a1.setState("Maharashtra");
		
		s.setAddress(a);
		s1.setAddress(a1);
		em.persist(a);
		em.persist(a1);
		System.out.println("Data is Added");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		

	}


}
