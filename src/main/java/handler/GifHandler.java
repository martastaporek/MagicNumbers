package handler;

import util.Loader;
import java.util.Arrays;

public class GifHandler implements Handler {

    private final byte[] EXTENSTION_SIGNATURE = {71, 73, 70, 56, 57, 97};
    private final byte[] ALTERNATIVE_EXTENSION_SIGNATURE = {71, 73, 70, 56, 55, 97};
    private final int SIGNATURE_LENGTH = 6;
    private Loader loader = new Loader();

    @Override
    public void handle(String path) {

        byte [] bytes = read(path);
        if(validate(bytes)){
            System.out.println(path + " is a gif file.");
        }else {
            System.out.println(path + " is not a gif file");
        }

    }

    public byte [] read(String path){

        return this.loader.readBytes(path, SIGNATURE_LENGTH);

    }

    public boolean validate(byte [] bytes){
        return Arrays.equals(bytes, EXTENSTION_SIGNATURE) ^ Arrays.equals(bytes, ALTERNATIVE_EXTENSION_SIGNATURE);
    }
}
