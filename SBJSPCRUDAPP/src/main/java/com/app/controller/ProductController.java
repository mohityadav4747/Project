package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Product;
import com.app.service.ProductService;

@Controller
public class ProductController {
	    @Autowired
	    private ProductService service;
	    
	    @RequestMapping("/")
	    public String productRegisterPage(Model model) {
	        List<Product> listProducts = service.listAll();
	        model.addAttribute("listProducts", listProducts);
	        
	        return "ProductData";
	    }
	    @RequestMapping("/add")
	    public String showNewProductPage(Model model) {
	        Product product=new Product();
	        model.addAttribute("product", product);
	         
	        return "Register";
	    }
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveProduct(@ModelAttribute("product") Product product) {
	        service.save(product);
	         
	        return "ProductData";
	    }
	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditProductPage(@PathVariable(name = "id") Integer id) {
	        ModelAndView mav = new ModelAndView("Edit");
	        Product product = service.get(id);
	        mav.addObject("product", product);
	         
	        return mav;
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteProduct(@PathVariable(name = "id") Integer id) {
	        service.delete(id);
	        return "ProductData";       
	    }
	    
}
