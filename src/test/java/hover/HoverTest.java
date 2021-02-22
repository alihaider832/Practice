package hover;

import base.Tests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTest extends Tests {

@Test

    public void testhoverUser1(){
    var Hoverpage = homePage.clickHover();
    var caption = Hoverpage.hoveroverfigure(1);

    assertTrue(caption.iscaptiondisplayed(),"caption not displayed");
    assertEquals(caption.gettitle(),"name: user1", "caption incorrect");
    assertEquals(caption.getlinktext(),"View profile", "title incorrect");
    assertTrue(caption.getlink().endsWith("/users/1"), "link incorrect");
}

}
