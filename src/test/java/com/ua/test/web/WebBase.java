package com.ua.test.web;

import com.ua.driver.Driver;
import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Before;

public class WebBase {

  @SneakyThrows
    @Before
    public void setUP(){
        Driver.initDriverForWeb();
    }

    @After
    public void tearDown(){
        Driver.quitDriver();
    }
}
