package com.tutorials.point;

import javax.persistence.*;

@Entity
public class EmployeeDetails {
   
    public EmployeeDetails(String id, String name, int salary) {
		super();
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
    public EmployeeDetails()
    {
    }
    
    @Id
	private String id;
    private String name;
    private int salary;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
    
}
