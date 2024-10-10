package com.redhat.shopping.catalog;

public class ProductNotFoundInCatalogException extends Exception {
<<<<<<< HEAD

=======
>>>>>>> 41316a8... Initial version of the shopping cart
    public ProductNotFoundInCatalogException(String errorMessage) {
        super(errorMessage);
    }

    public static ProductNotFoundInCatalogException ofId(int id) {
        return new ProductNotFoundInCatalogException(String.format("Unable to find product with ID: %d", id));
    }
}
