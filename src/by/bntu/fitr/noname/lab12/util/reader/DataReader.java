package by.bntu.fitr.noname.lab12.util.reader;

import by.bntu.fitr.noname.lab12.exception.EmptyFileException;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataReader {
    private static final Logger LOGGER = Logger.getRootLogger();

    private static final String READING_START = "dataReader started";
    private static final String READING_UNSUCCESSFUL = "data wasn't read";
    private static final String EMPTY_FILE_EXCEPTION = "file is empty";
    private static final String READING_SUCCESSFUL = "textData was read";

    public static String read(String filename) throws EmptyFileException {
        LOGGER.trace(READING_START);
        if (filename != null) {
            StringBuilder builder = new StringBuilder();

            try (FileInputStream fstream = new FileInputStream(filename);
                 BufferedReader br = new BufferedReader(new InputStreamReader(fstream))){

                String strLine;

                while ((strLine = br.readLine()) != null) {
                    builder.append(strLine).append("\n");
                }

                if (builder.length() == 0){
                    throw new EmptyFileException(EMPTY_FILE_EXCEPTION);
                }

            } catch (IOException e) {
                LOGGER.error(e);
            }
            LOGGER.trace(READING_SUCCESSFUL);

            return builder.toString();
        }
        LOGGER.trace(READING_UNSUCCESSFUL);
        return null;
    }
}
