package E23WordInspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private File file;
    private Scanner reader;

    public WordInspection(File file){
        this.file = file;
    }

    public Scanner readFile(){
        try{
            reader = new Scanner(file, "UTF-8");
        } catch(Exception e){
            System.out.println("We coulnd't read the file. Error: " + e.getMessage());
            return null;
        }
        return reader;
    }

    public int wordCount(){
        int wordCounter = 0;
        reader = readFile();

        while(reader.hasNext()){
            reader.next();
            wordCounter++;
        }

        reader.close();
        return wordCounter;
    }

    public int wordContainigZ(){
        int zCounter = 0;
        reader = readFile();

        while(reader.hasNext()){
            String word = reader.next();
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == 'z' || word.charAt(i) == 'Z'){
                    zCounter++;
                }
            }
        }

        reader.close();
        return zCounter;
    }

    public List<String> palindromes(){
        List<String> palindromes = new ArrayList<>();
        reader = readFile();

        while(reader.hasNext()){
            String word = reader.next();
            String reversedWord = reverse(word);
            if(word.equalsIgnoreCase(reversedWord)){
                palindromes.add(word);
            }
        }

        reader.close();
        return palindromes;
    }

    public List<String> wordsWhichContainAllVowels(){
        List<String> wordWithVowels = new ArrayList<>();
        reader = readFile();

        while(reader.hasNext()){
            String word = reader.next();
            if(word.toLowerCase().contains("a") || word.toLowerCase().contains("e")
                    || word.toLowerCase().contains("y") || word.toLowerCase().contains("i")
                    || word.toLowerCase().contains("o") || word.toLowerCase().contains("u")){
                wordWithVowels.add(word);
            }
        }

        reader.close();
        return wordWithVowels;

    }

    public String reverse(String word){
        StringBuilder sb = new StringBuilder(word);
        String reversedWord = sb.reverse().toString();
        return reversedWord;
    }
}


