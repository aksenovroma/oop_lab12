package by.bntu.fitr.noname.lab12.controller;

import by.bntu.fitr.noname.lab12.exception.EmptyFileException;
import by.bntu.fitr.noname.lab12.model.entity.Beef;
import by.bntu.fitr.noname.lab12.model.entity.Potato;
import by.bntu.fitr.noname.lab12.model.entity.Product;
import by.bntu.fitr.noname.lab12.model.entity.Tomato;
import by.bntu.fitr.noname.lab12.model.entity.container.Basket;
import by.bntu.fitr.noname.lab12.model.entity.container.ProductContainer;
import by.bntu.fitr.noname.lab12.util.reader.DataReader;
import by.bntu.fitr.noname.lab12.util.serializator.ContainerSerializator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product beef1 = new Beef(100, 30, Beef.Sort.BRISCKET);
        Product beef2 = new Beef(80, 20, Beef.Sort.KNUCKLE);
        Product tomato1 = new Tomato(200, 50.5, Tomato.Sort.CHERRY);
        Product tomato2 = new Tomato(30, 20, Tomato.Sort.ZHIGALO);
        Product potato = new Potato(150, 70.5, Potato.Sort.ULADAR);

        List<Product> products = new ArrayList<>();
        products.add(beef1);
        products.add(beef2);
        products.add(tomato1);
        products.add(tomato2);
        products.add(potato);

        ProductContainer basket = new Basket(products);

        try {
            System.out.println(DataReader.readFile("input/testFile.txt"));
        } catch (EmptyFileException e) {
            e.printStackTrace();
        }

    }
}
