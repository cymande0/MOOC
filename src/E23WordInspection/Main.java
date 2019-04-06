package E23WordInspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        File file = new File("src/textfile.txt");
        WordInspection wordInspection = new WordInspection(file);
        System.out.println(wordInspection.wordCount());
        System.out.println(wordInspection.wordContainigZ());
        System.out.println(wordInspection.palindromes());
        System.out.println(wordInspection.wordsWhichContainAllVowels());

    }
}