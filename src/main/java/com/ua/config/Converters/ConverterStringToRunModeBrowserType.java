package com.ua.config.Converters;

import com.ua.enums.BrowserType;
import com.ua.enums.RunModeBrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class ConverterStringToRunModeBrowserType implements Converter<RunModeBrowserType> {

    public RunModeBrowserType convert(Method method, String runMode) {
        return RunModeBrowserType.valueOf(runMode);
    }
}
