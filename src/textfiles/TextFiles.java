package textfiles;

import java.io.File;

public class TextFiles {

    public static void main(String[] args) {
        FileCounter fc = new FileCounter();
        System.out.println("Liczba wierszy: " + fc.lineCount(new File("nazwa.txt")));
        System.out.println("Liczba słów: " + fc.wordCount(new File("nazwa.txt")));
    }

}
