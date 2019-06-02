package by.bntu.fitr.noname.lab12.model.entity;

import java.util.Arrays;

public class Rack {
    private static Product[][] DEFAULT_PRODUCTS = new Product[0][0];

    private Product[][] products;

    public Rack() {
        products = DEFAULT_PRODUCTS;
    }

    public Rack(Product[][] products) {
        if (products != null) {
            this.products = products;
        } else {
            this.products = DEFAULT_PRODUCTS;
        }
    }

    public Product[][] getProducts() {
        return products;
    }

    public void setProducts(Product[][] products) {
        this.products = products;
    }

    public int getShelfCount() {
        return products.length;
    }

    public int getElementCount() {
        return products[0].length;
    }

    public Product[] getShelf(int index) {
        if (index >= 0 && index < products.length){
            return products[index];
        }
        return null;
    }

    public Product getElement(int rowIndex, int columnIndex) {
        return products[rowIndex][columnIndex];
    }

    public void setElement(int rowIndex, int columnIndex, Product element) {
        products[rowIndex][columnIndex] = element;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rack rack = (Rack) o;

        return Arrays.equals(products, rack.products);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(products);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Product[] product : products) {
            for (int j = 0; j < products[0].length; j++) {
                stringBuilder.append(product[j]).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
