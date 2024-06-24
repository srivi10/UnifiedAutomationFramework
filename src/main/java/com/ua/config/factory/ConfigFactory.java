package com.ua.config.factory;

import com.ua.config.FrameWorkConfig;
import org.aeonbits.owner.ConfigCache;

public class ConfigFactory {

    private ConfigFactory() {
    }

    public static FrameWorkConfig getConfig() {
        return ConfigCache.getOrCreate(FrameWorkConfig.class);
    }
}
