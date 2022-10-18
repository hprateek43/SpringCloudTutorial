package com.example.product.Interfaces;

import com.example.product.Models.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.Path;
import java.util.List;

public interface IProduct {

    @GetMapping("/ready")
    public boolean isInventoryAvailable();

    @GetMapping("fetch/{id}")
    public Item getFromInventory(@PathVariable int id);

    @GetMapping("/load")
    public List<Item> loadAllInventory();
}
