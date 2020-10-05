package com.hsbc.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Emp {

		
	private int empID;
	private String empName;
	private double empSalary;
	private LocalDate empDOB;
	
	
	
	
	public Emp(int empID, String empName, double empSalary, LocalDate empDOB) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDOB = empDOB;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public LocalDate getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(LocalDate empDOB) {
		this.empDOB = empDOB;
	}
	
	@Override
	public String toString() {
		return "Emp [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + ", empDOB=" + empDOB + "]";
	}
	
	
}
