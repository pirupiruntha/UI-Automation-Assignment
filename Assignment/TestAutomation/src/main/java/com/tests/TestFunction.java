package com.tests;

import com.codebase.TestBase;
import com.pages.PG_Common;

public class TestFunction extends TestBase {


    public static void bc_login(String name, String password){
        System.out.println("Start of bc_login");
        navigateToURL("https://the-internet.herokuapp.com/");
        click (PG_Common.lnk_FormAuthentication());
        type (PG_Common.txt_UserName(),name);
        type(PG_Common.txt_PassWord(),password);
        click (PG_Common.btn_Login());
        System.out.println("End of bc_login");
    }

    public static void bc_Logout(){
        click(PG_Common.btn_Logout());
    }
}
