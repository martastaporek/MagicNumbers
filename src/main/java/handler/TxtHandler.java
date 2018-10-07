package handler;

import util.Loader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TxtHandler implements Handler {

    //number of chars readBytes from file
    private final int SIZE = 2000;
    private Loader loader = new Loader();

    public void handle(String path){

        char [] chars = read(path);

        if(validate(chars)){
            System.out.println("This is txt file");
        }else {
            System.out.println("This no a txt file");
        }


    }

    public char[] read(String path){

        return this.loader.readChars(path, SIZE);

    }

    public boolean validate(char [] chars){

        for(char ch : chars){
            if(ch == 0){
                break;
            }
            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
                return false;
            }

        }
        return true;
    }
}
