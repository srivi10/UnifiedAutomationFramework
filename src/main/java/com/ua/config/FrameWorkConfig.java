package com.ua.config;


import com.ua.config.Converters.ConverterStringToBrowser;
import com.ua.enums.BrowserRemoteMode;
import com.ua.enums.BrowserType;
import com.ua.enums.RunModeBrowserType;
import org.aeonbits.owner.Config;

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
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteMode browserRemoteMode();
}
