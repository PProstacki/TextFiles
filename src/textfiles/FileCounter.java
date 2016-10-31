package textfiles;

import java.io.BufferedReader;
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
    
    public int wordCount(File file){
        int wordCount = 0;
        String line = "";
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            line = br.readLine();
            while(line != null){
                wordCount++;
                for(int x = 0;x < line.length() - 1; x++){
                    if(line.charAt(x) == ' ' || line.charAt(x) == '\t' || line.charAt(x) == '\n'){
                        wordCount++;
                    }
                }
                line = br.readLine();
            }
            
            br.close();
        }catch(IOException x){
            x.printStackTrace();
        }
        
        return wordCount;
    }
}
