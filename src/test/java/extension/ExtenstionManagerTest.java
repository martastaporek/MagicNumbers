package extension;

import CustomException.UnsupportedExtension;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtenstionManagerTest {

    private ExtenstionManager extenstionManager;

    @Before
    public void setup(){
        this.extenstionManager = new ExtenstionManager();
    }

    @Test(expected = UnsupportedExtension.class)
    public void test_throwExceptionForUnsupportedType(){
        this.extenstionManager.chooseExtenstion(".pdf");

    }

}