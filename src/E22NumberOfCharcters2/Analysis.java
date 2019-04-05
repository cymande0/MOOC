package E22NumberOfCharcters2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {

    private File file;
    private Scanner reader;

    public Analysis(File file) {
        this.file = file;
    }

    public int characters() throws FileNotFoundException{
        reader = new Scanner(file);
        int charCounter = 0;
        while(reader.hasNext()){
            String word = reader.useDelimiter("").next();
            charCounter += word.length();
        }
        reader.close();
        return charCounter;
    }

    public int lines() throws FileNotFoundException {
        reader = new Scanner(file);
        int lineCounter = 0;
        while(reader.hasNext()){
            reader.nextLine();
            lineCounter++;
        }
        reader.close();
        return lineCounter;
    }
}
