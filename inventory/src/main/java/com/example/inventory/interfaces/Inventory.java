package com.example.inventory.interfaces;


import com.example.inventory.Models.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface Inventory {

    @GetMapping("/hasProducts")
    public boolean hasAnyProduct();

    @GetMapping("/allProducts")
    public List<Item> getAllProducts();

    @GetMapping("/{id}")
    public Item findOne(@PathVariable int id);
}
