package by.bntu.fitr.noname.lab12.util.serializator;

import by.bntu.fitr.noname.lab12.model.entity.container.ProductContainer;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ContainerSerializator {
    public static final Logger LOGGER = Logger.getRootLogger();

    public static void serialize(ProductContainer container, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(container);
        } catch (Exception e) {
            LOGGER.error(e);
        }
    }

    public static ProductContainer deserialize(String fileName) {
        ProductContainer container = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            container = (ProductContainer) ois.readObject();
        } catch (Exception e) {
            LOGGER.error(e);
        }

        return container;
    }
}
