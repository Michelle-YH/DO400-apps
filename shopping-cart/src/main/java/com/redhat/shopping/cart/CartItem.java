package com.redhat.shopping.cart;

public class CartItem {
<<<<<<< HEAD

    private final int id;
    private final int price;
    private int quantity = 0;
=======
    private final int id;
    private final int price;
    private int qty = 0;
>>>>>>> 41316a8... Initial version of the shopping cart

    public CartItem(int id, int price) {
        this.id    = id;
        this.price = price;
    }

    public void increaseQuantityBy(int increment) {
<<<<<<< HEAD
        this.quantity += increment;
=======
        this.qty += increment;
>>>>>>> 41316a8... Initial version of the shopping cart
    }

    public int getId() {
        return this.id;
    }

    public int getPrice() {
        return this.price;
    }

<<<<<<< HEAD
    public int getQuantity() {
        return this.quantity;
=======
    public int getQty() {
        return this.qty;
>>>>>>> 41316a8... Initial version of the shopping cart
    }
}
