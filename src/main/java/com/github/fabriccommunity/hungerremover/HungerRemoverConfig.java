package com.github.fabriccommunity.hungerremover;

import io.github.cottonmc.cotton.config.annotations.ConfigFile;

@ConfigFile(name = "HungerRemover", extension = ".json")
public class HungerRemoverConfig {
    private boolean instantEat = false;

    public boolean shouldInstantEat() {
        return instantEat;
    }
}
