package by.bntu.fitr.noname.lab12.model.entity.container;

import by.bntu.fitr.noname.lab12.model.entity.Product;

import java.io.Serializable;

public interface ProductContainer extends Serializable {
    void setProduct(Product[] equipment);

    Product[] getProducts();

    Product get(int index);

    void set(Product product, int index);

    void add(Product product);

    void remove(Product product);

    boolean atContainer(Product product);

    int size();

    boolean isEmpty();
}
