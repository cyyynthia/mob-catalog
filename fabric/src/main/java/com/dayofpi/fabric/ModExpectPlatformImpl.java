package com.dayofpi.fabric;

public class ModExpectPlatformImpl {
    public static boolean shouldCrabsSpawn() {
        return MobCatalogFabric.CONFIG.spawnCrabs();
    }

    public static boolean shouldPenguinsSpawn() {
        return MobCatalogFabric.CONFIG.spawnPenguins();
    }
}
