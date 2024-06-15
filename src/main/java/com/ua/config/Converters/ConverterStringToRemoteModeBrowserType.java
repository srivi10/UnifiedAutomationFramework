package com.ua.config.Converters;

import com.ua.enums.BrowserRemoteMode;
import com.ua.enums.RunModeBrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class ConverterStringToRemoteModeBrowserType implements Converter<BrowserRemoteMode> {

    public BrowserRemoteMode convert(Method method, String remoteMode) {
        return BrowserRemoteMode.valueOf(remoteMode);
    }
}
