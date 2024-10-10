package com.redhat.shopping.catalog;

public class Product {
<<<<<<< HEAD

=======
>>>>>>> 41316a8... Initial version of the shopping cart
    private final int id;
    private final int price;

    public Product(int id, int price) {
        this.id    = id;
        this.price = price;
    }

    public int id() {
        return this.id;
    }

    public int price() {
        return this.price;
    }
}
