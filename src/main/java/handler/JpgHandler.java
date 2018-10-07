package handler;

import util.Loader;
import java.util.Arrays;

public class JpgHandler implements Handler {

    private final byte[] EXTENCTION_SIGNATURE = {-1, -40, -1};
    private final int SIGNATURE_LENGTH = 3;
    private Loader loader = new Loader();


    @Override
    public void handle(String path) {

        byte[] bytes = read(path);
        if (validate(bytes)) {
            System.out.println(path + " is jpg file");
        } else {
            System.out.println(path + " is not a jpg file");
        }

    }

    public byte[] read(String path) {

        return this.loader.readBytes(path, SIGNATURE_LENGTH);
    }

    public boolean validate(byte [] bytes){

        return Arrays.equals(bytes, EXTENCTION_SIGNATURE);
    }
}
