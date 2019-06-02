package by.bntu.fitr.noname.lab12.model.entity.container;

import by.bntu.fitr.noname.lab12.model.entity.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Basket implements ProductContainer {
    private List<Product> products = new ArrayList<>();

    public Basket() {
    }

    public Basket(List<Product> products) {
        if (products != null) {
            this.products = products;
        }
    }

    public Basket(Product[] products) {
        if (products != null) {
            this.products = Arrays.asList(products);
        }
    }

    public Product[] getProducts() {
        Product[] equipments = new Product[products.size()];

        for (int i = 0; i < equipments.length; i++) {
            equipments[i] = products.get(i);
        }

        return equipments;
    }

    @Override
    public void set(Product product, int index) {
        if (product != null && (index >= 0 && index < products.size())) {
            products.set(index, product);
        }
    }

    public void setProduct(Product[] products) {
        if (products == null) {

        }
        this.products = Arrays.asList(products);
    }

    @Override
    public Product get(int index) {
        if (index >= 0 && index < products.size()){
            return products.get(index);
        }
        return null;
    }

    @Override
    public void add(Product product) {
        if (product != null) {
            products.add(product);
        }
    }

    @Override
    public void remove(Product product) {
        if (atContainer(product)) {
            products.remove(product);
        }
    }

    @Override
    public boolean atContainer(Product product) {
        if (product != null) {
            return products.contains(product);
        }
        return false;
    }

    @Override
    public int size() {
        return products.size();
    }

    @Override
    public boolean isEmpty() {
        return products.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(products, basket.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Basket{").append('\n');

        for (Product product : products) {
            sb.append(product).append('\n');
        }

        sb.append('}');

        return sb.toString();
    }
}
