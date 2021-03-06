package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductManagement {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }


    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void displayProduct() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int index) {
        products.remove(index);
    }

    public void editProduct(int index, Product product) {
        products.set(index, product);
    }

    public Product findProduct(int index) {
        return products.get(index);
    }

    public void sortProduct() {
        Collections.sort(products);

    }
}