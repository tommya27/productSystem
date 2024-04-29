package Method;

import Pojo.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductManager {
    private ArrayList<Products> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Products product) {
        products.add(product);
        System.out.println("Product added successfully.");
    }

    public void deleteProduct(String id) {
        for (Products product : products) {
            if (product.getId().equals(id)) {
                products.remove(product);
                System.out.println("Product deleted successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }
    public void updateProduct(String id, String newName, double newPrice, int newSales1, int newSales2, int newSales3) {
        for (Products product : products) {
            if (product.getId().equals(id)) {
                if (newName != null) {
                    product.setName(newName);
                }
                if (newPrice != 0) {
                    product.setPrice(newPrice);
                }
                if (newSales1 != 0) {
                    product.setSales1(newSales1);
                }
                if (newSales2 != 0) {
                    product.setSales2(newSales2);
                }
                if (newSales3 != 0) {
                    product.setSales3(newSales3);
                }
                System.out.println("Product updated successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            for (Products product : products) {
                System.out.println(product);
            }
        }
    }


    public List<Products> searchProductsByName(String keyword) {
        return products.stream()
                .filter(e -> e.getName().contains(keyword))
                .collect(Collectors.toList());
    }

    public List<Products> searchProductsById(String keyword) {
        return products.stream()
                .filter(e -> e.getId().contains(keyword))
                .collect(Collectors.toList());
    }




}
