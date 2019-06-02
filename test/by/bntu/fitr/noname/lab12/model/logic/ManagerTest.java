package by.bntu.fitr.noname.lab12.model.logic;

import by.bntu.fitr.noname.lab12.model.entity.Beef;
import by.bntu.fitr.noname.lab12.model.entity.Potato;
import by.bntu.fitr.noname.lab12.model.entity.Product;
import by.bntu.fitr.noname.lab12.model.entity.Tomato;
import by.bntu.fitr.noname.lab12.model.entity.container.Basket;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ManagerTest {
    private Basket basket;
    private Basket basketEmpty;
    private Basket basketNull;

    @BeforeMethod
    public void setSalad() {
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

        basket = new Basket(products);
        basketEmpty = new Basket();
        basketNull = null;
    }

    @Test
    public void testCalcBasketWeight() {
        double expected = 560.0;
        double actual = Manager.calcBasketWeight(basket);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalcBasketWeightEmpty() {
        double expected = -1.0;
        double actual = Manager.calcBasketWeight(basketEmpty);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalcBasketWeightNull() {
        double expected = -1.0;
        double actual = Manager.calcBasketWeight(basketNull);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalcBasketPrice() {
        double expected = 191.0;
        double actual = Manager.calcBasketPrice(basket);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalcBasketPriceEmpty() {
        double expected = -1.0;
        double actual = Manager.calcBasketPrice(basketEmpty);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalcBasketPriceNull() {
        double expected = -1.0;
        double actual = Manager.calcBasketPrice(basketNull);

        assertEquals(expected, actual);
    }
}
