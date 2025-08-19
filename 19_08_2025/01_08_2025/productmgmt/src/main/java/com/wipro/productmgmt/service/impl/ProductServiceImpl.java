package com.wipro.productmgmt.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.productmgmt.entity.Product;
import com.wipro.productmgmt.repo.ProductRepo;
import com.wipro.productmgmt.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;

	@Override
	public void save(Product product) {
		productRepo.save(product);
	}

	@Override
	public List<Product> findAll() {
		return productRepo.findAll();
	}

	@Override
	public Product findById(int id) {
		Optional<Product> product = productRepo.findById(id);
		return product.orElse(null);
	}

	@Override
	public void deleteById(int id) {
		productRepo.deleteById(id);
	}

	@Override
	public List<Product> findByProductMake(String productMake) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByNameAndMake(String name, String make) {
	    return productRepo.findByProductNameAndProductMakeOrderByProductNameDesc(name, make);
	}
	
	@Override
	public Page<Product> findAll(Pageable pageable) {
	    return productRepo.findAll(pageable);
	}
	
}
