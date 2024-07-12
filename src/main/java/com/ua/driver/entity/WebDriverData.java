package com.ua.driver.entity;

import com.ua.enums.BrowserRemoteMode;
import com.ua.enums.BrowserType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class WebDriverData {
    private BrowserType browserType;
    private BrowserRemoteMode browserRemoteMode;

}
