//package com.example.demo.controller;
//
//import java.util.List;
//
//import org.hibernate.validator.spi.valuehandling.ValidatedValueUnwrapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.json.JacksonJsonParser;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.example.demo.dao.ProductRepo;
//import com.example.demo.dto.Product;
//import com.example.demo.service.ProductService;
//
//@Controller
//@CrossOrigin(origins="http://localhost:4200/", methods=RequestMethod.GET)
//public class ProductController {
//	@Autowired ProductService service;
//	
//	@GetMapping("/allproducts")
//	public ModelAndView getProducts(){
//		List<Product> products = service.findAll();
//		return products;
//	}
//}
