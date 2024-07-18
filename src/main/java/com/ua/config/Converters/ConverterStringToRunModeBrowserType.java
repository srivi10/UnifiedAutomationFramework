package com.ua.config.Converters;

import com.ua.enums.BrowserType;
import com.ua.enums.RunModeBrowserType;
import com.ua.enums.RunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class ConverterStringToRunModeBrowserType implements Converter<RunModeType> {

    public RunModeType convert(Method method, String runMode) {
        return RunModeType.valueOf(runMode.toUpperCase());
    }
}
