package com.oleti.tests;

import org.testng.IDataProviderMethod;
import org.testng.annotations.Test;

public class LoginTestExampleOfTestNG {

    @Test(dataProvider ="loginData",dataProviderClass = DataProviderLoginData.class)
      public static void getLoginData(String username,String password)
      {
          System.out.println("username is:"+username + "Password is:"+password);
    }
}
