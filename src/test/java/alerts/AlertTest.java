package alerts;

import base.Tests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class AlertTest extends Tests {

    @Test

    public void testacceptalert(){
        var alertPage = homePage.clickjavascriptalert();
        alertPage.triggeralert();
        alertPage.alert_clicktoaccept();
        assertEquals(alertPage.getresultText(), "You successfully clicked an alert");
    }

    @Test

    public void testGetTextFromAlert(){
        var alertpage = homePage.clickjavascriptalert();
        alertpage.triggerconfirm();
        String text = alertpage.alert_gettext();
        alertpage.alert_clicktodismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test

    public void testSetInputInAlert(){
        var alertpage = homePage.clickjavascriptalert();
        alertpage.triggerprompt();
        String text = "Hi";
        alertpage.alert_setInput(text);
        alertpage.alert_clicktoaccept();
        assertEquals(alertpage.getresultText(),"You entered: " + text, "wrong text");
    }
}
