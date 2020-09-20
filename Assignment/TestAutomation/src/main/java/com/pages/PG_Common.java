package com.pages;

public class PG_Common {

    public static String lnk_FormAuthentication(){ return "//a[normalize-space()='Form Authentication']" ;}
    public static String txt_UserName(){return "//input[@name='username']";}
    public static String txt_PassWord(){return "//input[@name='password']";}
    public static String btn_Login(){return "//i[@class='fa fa-2x fa-sign-in']";}
    public static String err_Message(){return "//div[@id='flash']";}
    public static String txt_Subheader(){return"//h4[@class='subheader']";}
    public static String btn_Logout(){return "//i[@class='icon-2x icon-signout']";}
}
