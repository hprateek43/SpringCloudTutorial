package com.example.product.Controllers;

import com.example.product.Interfaces.IProduct;
import com.example.product.Models.Item;
import com.example.product.Service.ProductService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/product")
public class ProductController implements IProduct {

    @Autowired
    @Lazy
    private ProductService productService;

    @Autowired
    private EurekaClient eurekaClient;

    @Override
    public boolean isInventoryAvailable() {
        return productService.checkInventoryAvailable();
    }

    @Override
    public Item getFromInventory(int id) {
        return null;
    }

    @Override
    public List<Item> loadAllInventory() {
        return null;
    }

    @RequestMapping("/testClient")
    public String checkEurekaClient(){
        InstanceInfo i = eurekaClient.getApplication("inventory").getInstances().get(0);

        return i.getHostName()+ ":"+Integer.toString(i.getPort());
    }
}
