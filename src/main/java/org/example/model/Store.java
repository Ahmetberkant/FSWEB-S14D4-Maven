package org.example.model;

public class Store {

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Bread("Bread", 10, "Fresh Bread");
        products[1] = new Chocolate("Chocolate", 15, "Dark Chocolate");
        products[2] = new Coke("Coke", 12, "Chilled Cola");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products == null || products.length == 0) {
            System.out.println("No products to show.");
            return;
        }

        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}
