package com.ua.config;

import com.ua.config.Converters.ConverStringtoURL;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/test/resources/browser-stack.properties"
})

public interface BrowserStackConfig extends Config {

    @Key("username")
    String userName();

    String key();

    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(ConverStringtoURL.class)
    URL browserStackURL();
}
