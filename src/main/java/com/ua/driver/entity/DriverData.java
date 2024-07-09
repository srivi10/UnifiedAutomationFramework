package com.ua.driver.entity;

import com.ua.enums.*;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DriverData {
    private BrowserType browserType;
    private BrowserRemoteMode browserRemoteMode;
    private MobilePlatformType mobilePlatformType;
    private RunModeType runModeType;
    private MobileRemoteModeType mobileRemoteModeType;


}
