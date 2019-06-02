package by.bntu.fitr.noname.lab12.model.logic;


import by.bntu.fitr.noname.lab12.model.entity.Product;
import by.bntu.fitr.noname.lab12.model.entity.container.Basket;
import org.apache.log4j.Logger;

public class Manager {
    public static final Logger LOGGER = Logger.getRootLogger();

    public static double calcBasketWeight(Basket basket) {
        LOGGER.trace("calcBasketWeight started");
        double basketWeight = -1.0;

        if (basket != null && !basket.isEmpty()) {
            basketWeight = 0.0;
            for (Product ingredient : basket.getProducts()) {
                basketWeight += ingredient.getWeight();
            }
        }
        LOGGER.info("calcBasketWeight returned : " + basketWeight);
        return basketWeight;
    }

    public static double calcBasketPrice(Basket basket) {
        LOGGER.trace("calcBasketPrice started");
        double basketPrice = -1.0;

        if (basket != null && !basket.isEmpty()) {
            basketPrice = 0.0;
            for (Product ingredient : basket.getProducts()) {
                basketPrice += ingredient.getPrice();
            }
        }
        LOGGER.info("calcBasketPrice returned : " + basketPrice);
        return basketPrice;
    }
}
