package com.redhat.shopping.cart;

public class AddToCartCommand {
<<<<<<< HEAD

    public int id;
    public int quantity;
=======
    public int id;
    public int qty;
>>>>>>> 41316a8... Initial version of the shopping cart

    public AddToCartCommand() {
    }

<<<<<<< HEAD
    public AddToCartCommand(int id, int quantity) {
        this.id       = id;
        this.quantity = quantity;
=======
    public AddToCartCommand(int id, int qty) {
        this.id  = id;
        this.qty = qty;
>>>>>>> 41316a8... Initial version of the shopping cart
    }
}
