package E21Printer;

import java.io.File;
import java.util.Scanner;

public class Printer {

    private Scanner reader;
    private File file;

    public Printer(String fileName){
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception{
        reader = new Scanner(this.file);
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            if(line.contains(word)){
                System.out.println(line);
            }
        }
        reader.close();
    }
}
