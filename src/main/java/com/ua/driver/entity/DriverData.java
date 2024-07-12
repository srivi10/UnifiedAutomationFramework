package com.ua.driver.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DriverData {
    WebDriverData webDriverData;
    MobileDriverData mobileDriverData;

}
