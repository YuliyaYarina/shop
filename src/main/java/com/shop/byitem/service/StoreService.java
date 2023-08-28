package com.shop.byitem.service;

import com.shop.byitem.entities.StoreProduct;
import com.shop.byitem.repository.StoreCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    private final StoreCart storeCart;

    public StoreService(StoreCart storeCart) {
        this.storeCart = storeCart;
    }

    public void addProduct(Integer... productsId) {
       storeCart.addProduct(productsId);
    }
    public StoreProduct getProduct(Integer id) {
        return storeCart.getProduct(id);
    }
    public List<StoreProduct> getProductList() {
        return storeCart.getProducts().values().stream().toList();
    }
}
