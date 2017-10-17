package com.sample.demo1.vo;

import java.util.Date;

public class Employee {

//   private long id;
	private Long id;
   private String firstName;
   private String lastName;
   private String phoneNumber;
   private String email;
   private Date hireDate;
   private String jobId;
   private double salary;
   private double commissionPct;
   private Long managerId;
   private Long departmentId;
//   private long managerId;
//   private long departmentId;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getHireDate() {
	return hireDate;
}
public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
}
public String getJobId() {
	return jobId;
}
public void setJobId(String jobId) {
	this.jobId = jobId;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public double getCommissionPct() {
	return commissionPct;
}
public void setCommission_pct(double commissionPct) {
	this.commissionPct = commissionPct;
}
public Long getManagerId() {
	return managerId;
}
public void setManagerId(Long managerId) {
	this.managerId = managerId;
}
public Long getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(Long departmentId) {
	this.departmentId = departmentId;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
			+ ", email=" + email + ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary=" + salary
			+ ", commission_pct=" + commissionPct + ", managerId=" + managerId + ", departmentId=" + departmentId
			+ "]";
}
      
}