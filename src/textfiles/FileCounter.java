package textfiles;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCounter {

    public int lineCount(File file) {
        int lineCount = 0;
        int previousChar = 0;
        int currentChar = 0; // Powinno sie zaczynac od 1 zeby nie trza bylo robic entera przy ostatniej linii
        try {
            FileReader fr = new FileReader(file);

            while ((currentChar = fr.read()) != -1) {
                if (previousChar == 13 && currentChar == 10) {
                    lineCount++;
                }
                previousChar = currentChar;
            }

            fr.close();
        } catch (IOException x) {
            x.printStackTrace();
        }

        return lineCount;
    }

}
