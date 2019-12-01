package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductRepo;
import com.example.demo.dto.Product;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired ProductRepo rep;

	@Override
	public List<Product> findAll() {
		return rep.findAll();
	}
	

}
