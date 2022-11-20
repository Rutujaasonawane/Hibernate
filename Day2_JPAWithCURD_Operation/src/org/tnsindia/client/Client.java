package org.tnsindia.client;

import org.tnsindia.entities.Student;
import org.tnsindia.service.StudentService;
import org.tnsindia.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		//CRUD Operation
		//create
		student.setID(20);
		student.setName("Madhu");
		service.addStudent(student);
		
		System.out.println("Data Added Succesfully");
		
		/*//Retreive data-find();
		student=service.findStudentById(25);
		System.out.println("ID: "+student.getID());
		System.out.println("ID: "+student.getName());*/
		
		
		/*//update
		student=service.findStudentById(25);
		student.setName("Madhu");
		service.updateStudent(student);*/
		
		//delete
		student=service.findStudentById(25);
		service.removeStudent(student);
		
		

	}

}
