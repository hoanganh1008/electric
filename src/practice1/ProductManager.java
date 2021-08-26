package practice1;

import com.sun.scenario.effect.impl.prism.ps.PPSBlend_ADDPeer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProductManager {
    private List<Product> products= new ArrayList<>();
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void sortProduct()
    {
        Collections.sort(products);
    }
    public void addProduct(Product product)
    {
        products.add(product);
    }
    public void updateProduct(int index, Product product)
    {
        products.set(index,product);
    }
    public void remove(int index)
    {
        products.remove(index);
    }
    public void show()
    {
        for(Product product: products)
        {
            System.out.println(product);
        }
    }
    public void displayProduct()
    {
        for ( Product product : products)
        {
            System.out.println(product.toString());
        }
    }
    public void editProduct(int index, Product product)
    {
        products.set(index,product);
    }
    public Product findProduct(int index)
    {
        return products.get(index);
    }

}
