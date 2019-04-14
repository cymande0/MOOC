package E34FileReading;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        FileManager f = new FileManager();
        String path = "src/textfile.txt";
        ArrayList<String> text = new ArrayList<>();
        text.add("Pozdrawiam");
        text.add("serdecznie");

        for (String line : f.read(path)) {
            System.out.println(line);
        }

        f.save(path, "Witam");
        f.save(path, text);
    }
}
