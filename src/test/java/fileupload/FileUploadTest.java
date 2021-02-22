package fileupload;

import base.Tests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTest extends Tests {

    @Test

    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadfile("C:\\Users\\aliha\\IdeaProjects\\pageObjectModel\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "uploaded wrong file");
    }
}
