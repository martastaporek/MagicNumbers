package util;

import java.io.*;

public class Loader {

    public byte[] readBytes(String path, int length) {

        byte[] bytes = new byte[length];

        try (FileInputStream in = new FileInputStream(path)) {
            in.read(bytes);
        } catch (FileNotFoundException e) {
            System.out.println("File path is incorrect");
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bytes;
    }

    public char [] readChars(String path, int length){

        char[] chars = new char[length];

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
}
