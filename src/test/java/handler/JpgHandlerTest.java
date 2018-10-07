package handler;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JpgHandlerTest {

    private JpgHandler jpgHandler;

    @Before
    public void setup(){
        this.jpgHandler = new JpgHandler();
    }

    @Test
    public void test_correctExtension(){
        byte [] bytes = this.jpgHandler.read("src/main/resources/correctExtention.jpeg");
        assertTrue(this.jpgHandler.validate(bytes));
    }

    @Test
    public void test_incorrectExtension(){
        byte [] bytes = this.jpgHandler.read("src/main/resources/incorrectExtenction.jpg");
        assertFalse(this.jpgHandler.validate(bytes));
    }

}