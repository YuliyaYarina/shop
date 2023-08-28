package com.shop.byitem.repository;

import com.shop.byitem.entities.StoreProduct;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Repository
@SessionScope
public class StoreCart {
    private final static Logger LOGGER = LoggerFactory.getLogger(StoreCart.class);
    private final Map<Integer, StoreProduct> products;
    public StoreCart(){
        this.products = new HashMap<>();
        LOGGER.info("Store card is created.");
    }

    @NonNull
    public void addProduct(Integer... productsId) {
        Arrays.stream(productsId)
                .forEach((productId -> {

                    if (products.containsKey(productId)) {
                        return;
                    }
                    products.put(productId, new StoreProduct(productId));
                }));
        LOGGER.info("Product(s) added in cart.");
    }
    @NonNull
    public StoreProduct getProduct(Integer id) {
        LOGGER.info("Product is got.");
        return products.get(id);
    }
    public Map<Integer,StoreProduct> getProducts() {
        LOGGER.info("Product list is got");
        return products;
    }
}
