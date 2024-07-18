package com.ua.test.mobile;

import com.ua.driver.Driver;
import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Before;

public class MobileBase {

    @SneakyThrows
    @Before
    public void setUP(){
        Driver.initDriverForMobile();
    }

    @After
    public void tearDown(){
        Driver.quitDriver();
    }
}
