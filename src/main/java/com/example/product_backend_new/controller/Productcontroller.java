package com.example.product_backend_new.controller;

import com.example.product_backend_new.dao.Productdao;
import com.example.product_backend_new.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Productcontroller {
    @Autowired
    private Productdao dao;

    @CrossOrigin(origins="*")
    @GetMapping("/viewall")
    public List<Product> Viewall()
    {
        return (List<Product>) dao.findAll();
    }

    @CrossOrigin(origins ="*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> add(@RequestBody Product p)
    {
        System.out.println(p.getProductCode());
        System.out.println(p.getName().toString());
        System.out.println(p.getMgDate().toString());
        System.out.println(p.getExDate().toString());
        System.out.println(p.getBrand().toString());
        System.out.println(p.getPrice());
        System.out.println(p.getSellerName().toString());
        System.out.println(p.getDistributorName().toString());
        dao.save(p);
        HashMap<String,String> map= new HashMap<>();
        map.put("status","success");
        return map;

    }

}
