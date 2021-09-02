package com.oleti.tests;

import org.testng.annotations.DataProvider;

public class DataProviderLoginData {


    @DataProvider(name="loginData")
    public static Object[][] setLoginData()
    {
        return new Object[][]{{"username1","password1"},{"username2","password2"}};
    }

}
