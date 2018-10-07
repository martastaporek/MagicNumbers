package handler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TxtHandler implements Handler {

    //number of chars read from file
    private final int SIZE = 2000;

    public void handle(String path){

        char [] chars = read(path);

        if(validate(chars)){
            System.out.println("This is txt file");
        }else {
            System.out.println("This no a txt file");
        }


    }

    private char[] read(String path){

        char[] chars = new char[SIZE];

        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            in.read(chars);
        }catch (FileNotFoundException e) {
            System.out.println("Filepath is incorrect");
            System.exit(1);
        }catch (IOException e) {
            e.printStackTrace();
        }

        return chars;

    }

    private boolean validate(char [] chars){

        for(char ch : chars){
            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
                return false;
            }
            if(ch == 0){
                break;
            }
        }
        return true;
    }
}
