package com.ua.test;

import com.ua.config.ConfigFactory;
import org.junit.jupiter.api.Test;

public class WebTest {

    @Test
    void browserLaunch() {
        System.out.println(ConfigFactory.getConfig().browser());
    }
}
