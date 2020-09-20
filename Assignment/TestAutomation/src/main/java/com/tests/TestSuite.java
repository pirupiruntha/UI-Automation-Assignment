package com.tests;

import com.pages.PG_Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.codebase.TestBase;

public class TestSuite extends TestBase {

    @Test (description = "Verify login secure Area")
    public void ASS_TEST_001(){
        System.out.println("Start of test ASS_TEST_001");
        navigateToURL("https://the-internet.herokuapp.com/");
        click(PG_Common.lnk_FormAuthentication());
        Assert.assertEquals(getTextFromElement(PG_Common.txt_Subheader()),"This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.");
        System.out.println("End of test ASS_TEST_001");
    }

    @Test (description = "Verify Login Alert Displayed")
    public void ASS_TEST_002(){
        System.out.println("Start of test ASS_TEST_002");
        TestFunction.bc_login("tomsmith","SuperSecretPassword!");
       // Assert.assertEquals(labelText(PG_Common.txt_login()),"You logged into a secure area!");
        checkForText();
        System.out.println("End of test ASS_TEST_002");
    }

    @Test (description = "Verify Login Alert Message Content")

    public void ASS_TEST_003(){
        System.out.println("Start of test ASS_TEST_002");
        TestFunction.bc_login("tomsmith","SuperSecretPassword!");
        checkForText();
        System.out.println("End of test ASS_TEST_003");
    }


    @Test (description = "Verify Login Page Displayed")

    public void ASS_TEST_004(){
        System.out.println("Start of test ASS_TEST_004");
        ASS_TEST_002();
        TestFunction.bc_Logout();
        Assert.assertEquals(getTextFromElement(PG_Common.txt_Subheader()),"This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.");
        System.out.println("End of test ASS_TEST_004");

    }

    @Test(description = "Verify Logout Alert Message Content")
    public void ASS_TEST_005(){
        System.out.println("Start of test ASS_TEST_005");
        ASS_TEST_004();
        checkLogOut();
        System.out.println("End of test ASS_TEST_005");

    }

    @Test (description = "Verify invalid Login Alert Displayed")
    public void ASS_TEST_006(){
        System.out.println("Start of test ASS_TEST_006");
        TestFunction.bc_login("TestAutomation","Test");
        checkErrorLOgin();
        System.out.println("End of test ASS_TEST_006");
    }

    @Test (description ="Verify invalid login Alert Message Content")
    public void ASS_TEST_007(){
        System.out.println("Start of test ASS_TEST_007");
        TestFunction.bc_login("TestAutomation","Test");
        checkErrorLOgin();
        System.out.println("End of test ASS_TEST_007");
    }



}
