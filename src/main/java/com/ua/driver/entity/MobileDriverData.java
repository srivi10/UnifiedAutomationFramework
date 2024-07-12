package com.ua.driver.entity;

import com.ua.enums.MobilePlatformType;
import com.ua.enums.MobileRemoteModeType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MobileDriverData {
    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;
    }
