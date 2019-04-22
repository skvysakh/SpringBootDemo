package com.vysakhan.boot.demo.demobootapplication.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javassist.SerialVersionUID;

@Entity
@Table(name="EMPLOYEE")
public class Employee implements Serializable{
    
    private static final long SerialVersionUID = 1L;
    
    @Id
    @Column(name="EMPLOYEE_ID")
    @GeneratedValue
    private long empId;
     @Column(name="FIRST_NAME")
    private String firstName;
     @Column(name="LAST_NAME")
    private String lastName;
     @Column(name="EMPCODE")
    private String empCode;
     @Column(name="SALARY")
    private double salary;
    
    public Employee(){
        super();
    }
    
   public  Employee(long empId,String firstName, String lastName, String empCode, double salary){
        super();
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.empCode = empCode;
        this.salary = salary;
    }

	/**
	 * @return the empId
	 */
	public long getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(long empId) {
		this.empId = empId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the empCode
	 */
	public String getEmpCode() {
		return empCode;
	}

	/**
	 * @param empCode the empCode to set
	 */
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
    
}
