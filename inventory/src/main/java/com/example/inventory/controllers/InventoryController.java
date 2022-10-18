package com.example.inventory.controllers;

import com.example.inventory.Models.Item;
import com.example.inventory.Service.InventoryService;
import com.example.inventory.interfaces.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/inventory")
public class InventoryController implements Inventory {

    @Autowired
    private InventoryService inventoryService;

    @Override
    public boolean hasAnyProduct() {
        return inventoryService.hasAny();
    }

    @Override
    public List<Item> getAllProducts() {
        return inventoryService.getAll();
    }

    @Override
    public Item findOne(int id) {
        return inventoryService.getOne(id);
    }
}
