package com.tutorials.point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DemoApplication {
      
	
	  @Autowired
	  private EmployeeService emplServ;
      
	  @RequestMapping(value = "/Employees")
      public List<EmployeeDetails> getAllEmployee(){
         return emplServ.getAllDetails();
      
     }
      @RequestMapping(value = "/Employees/{id}")
      public EmployeeDetails getEmployee(@PathVariable String id)
      {
    	  return emplServ.getEmp(id);
      }
      @RequestMapping(method=RequestMethod.POST, value="/Employees")
    	  public void addEmp(@RequestBody EmployeeDetails e)
    	  {
    	  emplServ.addEmployee(e);
    	  }
          
     @RequestMapping(method=RequestMethod.PUT, value="/Employees/{id}")
     public void updateEmp(@RequestBody EmployeeDetails e, @PathVariable String id)
     {
    	 emplServ.updateEmployee(id,e );
     }
     @RequestMapping(method=RequestMethod.DELETE, value="/Employees/{id}")
     public void deleteEmp( @PathVariable String id)
     {
    	 emplServ.deleteEmployee(id);
     }
       
   
 
}