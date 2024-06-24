package com.ua.config;


import com.ua.config.Converters.ConverStringtoURL;
import com.ua.config.Converters.ConverterStringToBrowser;
import com.ua.config.Converters.ConverterStringToRemoteModeBrowserType;
import com.ua.config.Converters.ConverterStringToRunModeBrowserType;
import com.ua.enums.BrowserRemoteMode;
import com.ua.enums.BrowserType;
import com.ua.enums.RunModeBrowserType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})

public interface FrameWorkConfig extends Config {
    @DefaultValue("CHROME")
    @ConverterClass(ConverterStringToBrowser.class)
    BrowserType browser();


    @Key("runModeBrowser")
    @ConverterClass(ConverterStringToRunModeBrowserType.class)
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    @ConverterClass(ConverterStringToRemoteModeBrowserType.class)
    BrowserRemoteMode browserRemoteMode();

    @Key("runModeMobile")
    BrowserRemoteMode mobileRunMode();

    @Key("mobileRemoteMode")
    BrowserRemoteMode mobileRemoteMode();

    @ConverterClass(ConverStringtoURL.class)
    URL seleniumGridURL();

    @ConverterClass(ConverStringtoURL.class)
    URL selenoidURL();

    @ConverterClass(ConverStringtoURL.class)
    @DefaultValue("https:/127.0.0.1:4723/wd/hub")
    URL localAppiumServerURL();
}
