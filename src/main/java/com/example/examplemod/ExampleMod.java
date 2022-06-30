package com.example.examplemod;

import bta.Mod;
import net.minecraft.client.Minecraft;

public class ExampleMod implements Mod {
    @Override
    public void init(Minecraft minecraft) {
        System.out.println("[modid] Initialized.");
    }

    @Override
    public void update() {

    }

    @Override
    public void tick() {

    }
}
