package textfiles;

import java.io.File;

public class TextFiles {

    public static void main(String[] args) {
        FileCounter fc = new FileCounter();
        System.out.println(fc.lineCount(new File("nazwa.txt")));
    }

}
