package doyle.service;

import java.util.List;

import doyle.domain.Product;
     /*
     http://docs.spring.io/docs/Spring-MVC-step-by-step/part4.html
     hsqldb
     http://localhost:8080/FirstMVC/hello.htm
      */
public class SimpleProductManager implements ProductManager {

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void increasePrice(int percentage) {
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() *
                        (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
