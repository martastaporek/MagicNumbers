package CustomException;

public class UnsupportedExtension extends RuntimeException {

    public UnsupportedExtension(String message) {
        super(message);
    }
}
