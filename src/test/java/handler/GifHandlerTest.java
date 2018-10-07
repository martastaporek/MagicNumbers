package handler;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GifHandlerTest {

    private GifHandler gifHandler;

    @Before
    public void setup(){
        this.gifHandler = new GifHandler();
    }

    @Test
    public void test_correctExtension(){
        byte [] bytes = this.gifHandler.read("src/main/resources/correctExtenction.gif");
        assertTrue(this.gifHandler.validate(bytes));
    }

    @Test
    public void test_incorrectExtension(){
        byte [] bytes = this.gifHandler.read("src/main/resources/incorrectExtenction.gif");
        assertFalse(this.gifHandler.validate(bytes));
    }

}