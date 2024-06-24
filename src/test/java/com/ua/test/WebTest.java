package com.ua.test;

import com.ua.config.factory.ConfigFactory;
import org.junit.jupiter.api.Test;
import com.ua.config.factory.BrowserStackConfigFactory;

public class WebTest {

    @Test
    void browserLaunch() {
        System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());
    }
}
