package com.github.fabriccommunity.hungerremover;

import io.github.cottonmc.cotton.config.ConfigManager;
import net.fabricmc.api.ModInitializer;

public class HungerRemoverMod implements ModInitializer {
    private static HungerRemoverConfig config;

    public static HungerRemoverConfig getConfig() {
        return config;
    }

    @Override
    public void onInitialize() {
        config = ConfigManager.loadConfig(HungerRemoverConfig.class);
    }
}
