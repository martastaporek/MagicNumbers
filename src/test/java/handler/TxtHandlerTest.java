package handler;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TxtHandlerTest {

    private TxtHandler txtHandler;

    @Before
    public void setup(){
        this.txtHandler = new TxtHandler();
    }

    @Test
    public void test_correctExtension(){
        char [] chars = this.txtHandler.read("src/main/resources/correctExtenction.txt");
        assertTrue(this.txtHandler.validate(chars));
    }

    @Test
    public void test_incorrectExtension(){
        char [] chars = this.txtHandler.read("src/main/resources/incorrectExtenction.txt");
        assertFalse(this.txtHandler.validate(chars));
    }
}