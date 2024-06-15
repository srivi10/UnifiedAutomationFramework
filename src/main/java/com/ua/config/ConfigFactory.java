package com.ua.config;

import org.aeonbits.owner.ConfigCache;

public class ConfigFactory {

    private ConfigFactory() {
    }

    public static FrameWorkConfig getConfig() {
        return ConfigCache.getOrCreate(FrameWorkConfig.class);
    }
}
