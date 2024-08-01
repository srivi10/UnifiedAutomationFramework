package com.ua.config;


import com.ua.config.Converters.*;
import com.ua.enums.*;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties",
        "file:${user.dir}/src/test/resources/dev-staging-config.properties"
})

public interface FrameWorkConfig extends Config {

    @DefaultValue("staging")
    String environment();

    @Key("${environment}.webURL")
    String webURL();

    @DefaultValue("CHROME")
    @ConverterClass(ConverterStringToBrowser.class)
    BrowserType browser();

    @Key("runModeBrowser")
    @ConverterClass(ConverterStringToRunModeBrowserType.class)
    RunModeType browserRunMode();

    @Key("browserRemoteMode")
    @ConverterClass(ConverterStringToRemoteModeBrowserType.class)
    BrowserRemoteMode browserRemoteMode();

//    @Key("runModeMobile")
//    BrowserRemoteMode mobileRunMode();

    @Key("runModeMobile")
    @ConverterClass(ConverterStringToRunModeBrowserType.class)
    RunModeType mobileRunMode();

    @Key("mobileRemoteMode")
    @ConverterClass(StringToMobileRemoteModeTypeConverter.class)
    MobileRemoteModeType mobileRemoteMode();

    @ConverterClass(ConverStringtoURL.class)
    URL seleniumGridURL();

    @ConverterClass(ConverStringtoURL.class)
    URL selenoidURL();

    @Key("seleniumGridURL")
    URL localAppiumServerURL();

    @ConverterClass(StringToMobilePlatformTypeConverter.class)
    @DefaultValue("ios")
    MobilePlatformType mobilePlatformType();
}
