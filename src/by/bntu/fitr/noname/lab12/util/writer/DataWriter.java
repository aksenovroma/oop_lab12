package by.bntu.fitr.noname.lab12.util.writer;

import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {
    private static final Logger LOGGER = Logger.getRootLogger();

    private static final String WRITE_START = "dataWriter started";
    private static final String WRITE_FINISH = "dataWriter finished";

    public void write(Object o, String fileName) {
        LOGGER.trace(WRITE_START);
        if (o != null) {
            try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                fileWriter.write(o.toString() + '\n');
            } catch (IOException e) {
                LOGGER.error(e);
            }
        }
        LOGGER.trace(WRITE_FINISH);
    }
}
