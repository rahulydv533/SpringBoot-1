package com.tutorials.point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	private List<EmployeeDetails> empService=new ArrayList<>(Arrays.asList(
  		  new EmployeeDetails("111","Rahul",5000),
  		  new EmployeeDetails("222","Roshan",6000),
  		  new EmployeeDetails("333","Abhisek",8000)
  		  ));
	
	public List<EmployeeDetails> getAllDetails(){
		List<EmployeeDetails> empDet=new ArrayList<>();
        empRepo.findAll().forEach(empDet::add);
		return empDet;
	}
	
	public EmployeeDetails getEmp(String id ) {
       return (EmployeeDetails) empRepo.findOne(id);
	}
	public void addEmployee(EmployeeDetails e)
	{
		empRepo.save(e);
	}
	public void updateEmployee(String id, EmployeeDetails e)
	{
		empRepo.save(e);
	}
	public void deleteEmployee(String id)
	{
		empRepo.delete(id);;
	}

}
