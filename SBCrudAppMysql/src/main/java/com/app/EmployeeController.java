package com.app;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  
public class EmployeeController {    
    @Autowired    
    private EmployeeDao dao;  
         
    @RequestMapping("/register")    
    public String showForm(){    
       // m.addAttribute("command", new Employee());  
        return "Register";   
    }    
     
    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save( Employee emp){ 
    	//model.addAttribute("msg","New Employee Added succes..!");
        dao.save(emp);    
        return "Register";    
    }    
    @RequestMapping("/all")    
    public String viewEmp(Model m){    
        List<Employee> list=dao.getEmployees();    
        m.addAttribute("list",list);  
        return "ViewEmp";    
    }    
      
    @RequestMapping(value="/one/{employee_id}")    
    public String getEmp(@PathVariable Integer employee_id){    
        Employee emp=dao.getEmpById(employee_id);    
        //m.addAttribute("command",emp);  
        return "ViewEmp";    
    }    
    @RequestMapping(value="/update",method = RequestMethod.POST)    
    public String edit( Employee emp){    
        dao.update(emp);    
        return "Edit";    
    }    
    @RequestMapping(value="/delete/{employee_id}",method = RequestMethod.GET)    
    public String delete(@PathVariable Integer employee_id){    
        dao.delete(employee_id);    
        return "ViewEmp";
    }    
    @RequestMapping("/")    
    public String show(Model m){    
       // m.addAttribute("command", new Employee());  
        return "index";   
    }    
}  