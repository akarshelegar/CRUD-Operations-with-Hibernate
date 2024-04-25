package com.techpalle.model;

import javax.persistence.*;
@Entity
public class Employee {
	
	@Id
	private int eno;
	private String ename;
	private int esalary;
	private String edesignation;
	public Employee()
	{
		super();
	}
	
	public Employee(int eno, String ename, String edesignation, int esalary)
	{
		super();
		this.eno = eno;
		this.ename = ename;
		this.edesignation = edesignation;
		this.esalary = esalary;
	}
	
	public int getEno()
	{
		return this.eno;
	}
	public void setEno(int id)
	{
		this.eno = id;
	}
	public String getEname()
	{
		return this.ename;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public String getEdesignation()
	{
		return this.edesignation;
	}
	public void setEdesignation(String edesignation)
	{
		this.edesignation = edesignation;
	}
	public int getEsalary()
	{
		return this.esalary;
	}
	public void setEsalary(int esalary)
	{
		this.esalary = esalary;
	}	

}
