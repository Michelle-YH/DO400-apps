package com.redhat.shopping.cart;

import com.redhat.shopping.catalog.Catalog;
import com.redhat.shopping.catalog.Product;
import com.redhat.shopping.catalog.ProductNotFoundInCatalogException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class CartService {

    private final Map<Integer, CartItem> products = new HashMap<>();
<<<<<<< HEAD
=======

>>>>>>> 41316a8... Initial version of the shopping cart
    private int totalItems = 0;

    @Inject
    Catalog catalog;

    private void recalculate() {
        this.totalItems = 0;

        this.products.forEach((id, cartItem) -> {
<<<<<<< HEAD
            this.totalItems += cartItem.getQuantity();
        });
    }

    public void addProduct(int productId, int quantity) throws ProductNotFoundInCatalogException {
=======
            this.totalItems += cartItem.getQty();
        });
    }

    public void addProduct(int productId, int qty) throws ProductNotFoundInCatalogException {
>>>>>>> 41316a8... Initial version of the shopping cart
        Product product = this.catalog.ofId(productId);

        if (!this.products.containsKey(productId)) {
            this.products.put(product.id(), new CartItem(product.id(), product.price()));
        }

<<<<<<< HEAD
        this.products.get(product.id()).increaseQuantityBy(quantity);
=======
        this.products.get(product.id()).increaseQuantityBy(qty);
>>>>>>> 41316a8... Initial version of the shopping cart

        this.recalculate();
    }

    public void clear() {
        this.products.clear();
        this.recalculate();
    }

    public CartView cartContent() {
        return new CartView(this.products.values(), this.totalItems());
    }

    public void removeProduct(int productId) throws ProductNotFoundInCatalogException, ProductNotInCartException {
        Product product = this.catalog.ofId(productId);

        if (!this.products.containsKey(product.id())) {
            throw ProductNotInCartException.ofId(product.id());
        }

        this.products.remove(product.id());

        this.recalculate();
    }

    public int totalItems() {
        return this.totalItems;
    }

    public int totalProducts() {
        return this.products.size();
    }
}
