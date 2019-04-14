package E34FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    private FileWriter writer;
    private File file;
    private Scanner reader;


    public ArrayList<String> read(String path){
        ArrayList<String> readText = new ArrayList<>();
        this.file = new File(path);
        try{
            this.reader = new Scanner(file);
            while(reader.hasNext()){
                readText.add(reader.nextLine());
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        reader.close();
        return readText;
    }

    public void save(String file, String text){
        try{
            this.writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void save(String file, ArrayList<String> texts){
        try{
            this.writer = new FileWriter(file);
            for(String word : texts){
                writer.write(word + '\n');
            }
            writer.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
