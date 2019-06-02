package by.bntu.fitr.noname.lab12.model.entity;

import by.bntu.fitr.noname.lab12.exception.ProductPriceWrongException;
import by.bntu.fitr.noname.lab12.exception.ProductWeightWrongException;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private static final double DEFAULT_WEIGHT = 1.0;
    private static final double DEFAULT_PRICE = 1.0;

    private double weight;
    private double price;

    public Product() {
        weight = DEFAULT_WEIGHT;
        price = DEFAULT_PRICE;
    }

    public Product(double weight, double price) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = DEFAULT_WEIGHT;
        }
        if (price > 0) {
            this.price = price;
        } else {
            this.price = DEFAULT_PRICE;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws ProductWeightWrongException {
        if (weight <= 0) {
            throw new ProductWeightWrongException();
        }
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws ProductPriceWrongException {
        if (price <= 0) {
            throw new ProductPriceWrongException();
        }
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.weight, weight) == 0 &&
                Double.compare(product.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, price);
    }

    @Override
    public String toString() {
        return "weight=" + weight +
                "price=" + price;
    }
}
