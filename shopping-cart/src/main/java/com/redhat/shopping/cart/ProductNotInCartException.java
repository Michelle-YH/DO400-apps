package com.redhat.shopping.cart;

public class ProductNotInCartException extends Exception {
<<<<<<< HEAD

=======
>>>>>>> 41316a8... Initial version of the shopping cart
    public ProductNotInCartException(String errorMessage) {
        super(errorMessage);
    }

    public static ProductNotInCartException ofId(int id) {
        return new ProductNotInCartException(String.format("Product with ID: %d not found in cart", id));
    }
}
