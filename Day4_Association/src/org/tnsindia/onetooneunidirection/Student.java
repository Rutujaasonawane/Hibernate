package org.tnsindia.onetooneunidirection;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Student")
public class Student implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int StudentId;
	@Column(name="Name")
	private String StudentName;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Address_Id")
	private Address address;
	public Student() {
		
	}
	public Student(int StudentId, String StudentName, Address address) {
		super();
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.address = address;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int StudentId) {
		this.StudentId = StudentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String StudentName) {
		this.StudentName = StudentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", address=" + address + "]";
	}
	
	
	
	
	

}
