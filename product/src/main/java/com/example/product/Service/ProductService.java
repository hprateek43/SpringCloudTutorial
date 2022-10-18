package com.example.product.Service;

import com.example.product.Models.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public boolean checkInventoryAvailable(){
        return false;
    }

    public Item getFromInventory(int id) {
        return null;
    }

    public List<Item> loadAllInventory() {
        return null;
    }
}
