package handler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class JpgHandler implements Handler {

    private final byte[] EXTENCTION_SIGNATURE = {-1, -40, -1};
    private final int SIGNATURE_LENGTH = 3;


    @Override
    public void handle(String path) {

        byte[] bytes = read(path);
        if (validate(bytes)) {
            System.out.println("This is jpg file");
        } else {
            System.out.println("This is not a jpg file");
        }


    }

    public byte[] read(String path) {

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

        return Arrays.equals(bytes, EXTENCTION_SIGNATURE);
    }
}
