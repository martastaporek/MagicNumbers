package handler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class GifHandler implements Handler {

    private final byte[] EXTENSTION_SIGNATURE = {71, 73, 70, 56, 57, 97};
    private final byte[] ALTERNATIVE_EXTENSION_SIGNATURE = {71, 73, 70, 56, 55, 97};
    private final int SIGNATURE_LENGTH = 6;

    @Override
    public void handle(String path) {

        byte [] bytes = read(path);



    }

    public byte [] read(String path){

        byte[] bytes = new byte[SIGNATURE_LENGTH];

        try (FileInputStream in = new FileInputStream(path)) {
            in.read(bytes);
        } catch (FileNotFoundException e) {
            System.out.println("File path is incorrect");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bytes;

    }

    public boolean validate(byte [] bytes){
        return Arrays.equals(bytes, EXTENSTION_SIGNATURE) ^ Arrays.equals(bytes, ALTERNATIVE_EXTENSION_SIGNATURE);
    }
}
