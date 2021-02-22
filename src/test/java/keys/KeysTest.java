package keys;

import base.Tests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class KeysTest extends Tests {

    @Test

    public void testbackspace(){
        var keyPage = homePage.clickKeypresses();
        keyPage.entertext("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getresult(),"You entered: BACK_SPACE");
    }

    @Test
    public void testpi(){
        var keyPage = homePage.clickKeypresses();
        keyPage.enterpi();
    }
}
