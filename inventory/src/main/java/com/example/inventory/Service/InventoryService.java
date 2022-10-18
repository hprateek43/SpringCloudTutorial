package com.example.inventory.Service;

import com.example.inventory.Models.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryService {

    public boolean hasAny(){
        return true;
    }

    public Item getOne(int id){
        Item t = new Item();
        t.id = 0;
        t.itemName = "mock";
        t.description = "mock description";
        t.price = 0.0f;

        return t;
    }

    public List<Item> getAll(){
        ArrayList<Item> l = new ArrayList<Item>();
        Item t = new Item();
        t.id = 0;
        t.itemName = "mock";
        t.description = "mock description";
        t.price = 0.0f;
        l.add(t);

        return l;
    }
}
