package com.example.product_backend_new.dao;

import com.example.product_backend_new.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface Productdao extends CrudRepository<Product,Integer>
{
}
