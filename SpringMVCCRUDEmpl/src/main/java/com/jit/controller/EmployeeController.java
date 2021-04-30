package com.jit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jit.dao.EmployeeDao;
import com.jit.model.Employee;

@Controller    
@RequestMapping("/emp")
public class EmployeeController {    
    @Autowired    
    EmployeeDao dao;  
         
    @RequestMapping("/register")    
    public String showForm(Model m){    
        m.addAttribute("command", new Employee());  
        return "Register";   
    }    
     
    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("emp") Employee emp){    
        dao.save(emp);    
        return "redirect:/ViewEmp";    
    }    
    @RequestMapping("/viewemp")    
    public String viewEmp(Model m){    
        List<Employee> list=dao.getEmployees();    
        m.addAttribute("list",list);  
        return "ViewEmp";    
    }    
      
    @RequestMapping(value="/editemp/{id}")    
    public String edit(@PathVariable Integer id, Model m){    
        Employee emp=dao.getEmpById(id);    
        m.addAttribute("command",emp);  
        return "Edit";    
    }    
    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("emp") Employee emp){    
        dao.update(emp);    
        return "redirect:/ViewEmp";    
    }    
    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable Integer id){    
        dao.delete(id);    
        return "redirect:/ViewEmp";    
    }     
}  