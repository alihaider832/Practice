package dropdown;

import base.Tests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DropdownTest extends Tests {

    @Test

    public void testSelectOption(){
        var dropdown = homePage.clickDropdown();
        String option = "Option 1";
        dropdown.selectFromDropdown(option);
        var selectedOptions = dropdown.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1 , "Incorrect number");
        assertTrue(selectedOptions.contains(option),"option not selected");
    }
}
