package com.vysakhan.boot.demo.demobootapplication.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//@Data
@Document(collection = "student")
public class Student {
    
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Integer totalMark;
    private String contactNo;
    private String email;
    
    public Student(){
        super();
    }
    public Student(String firstName, String lastName, Integer totalMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalMark = totalMark;
    }
    public Student(String firstName, String lastName, Integer totalMark,String contactNo, String email){
        this(firstName,lastName,totalMark);
        this.contactNo = contactNo;
        this.email = email;
    }
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the totalMark
	 */
	public Integer getTotalMark() {
		return totalMark;
	}
	/**
	 * @param totalMark the totalMark to set
	 */
	public void setTotalMark(Integer totalMark) {
		this.totalMark = totalMark;
	}
	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}
	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
    
    
    
}
