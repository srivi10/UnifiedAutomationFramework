package com.ua.config.Converters;

import com.ua.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

import java.util.Map;

public class ConverterStringToBrowser implements Converter<BrowserType> {

    public BrowserType convert(Method method, String browserName) {
        Map<String, BrowserType> stringBrowserTypeMap = Map.
                of("CHROME", BrowserType.CHROME,
                        "FIREFOX", BrowserType.FIREFOX);

        return stringBrowserTypeMap
                .getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);


    }
}
