package extension;

import CustomException.UnsupportedExtension;
import org.junit.Before;
import org.junit.Test;

public class ExtensionManagerTest {

    private ExtensionManager extensionManager;

    @Before
    public void setup(){
        this.extensionManager = new ExtensionManager();
    }

    @Test(expected = UnsupportedExtension.class)
    public void test_throwExceptionForUnsupportedType(){
        this.extensionManager.chooseExtenstion(".pdf");

    }

}