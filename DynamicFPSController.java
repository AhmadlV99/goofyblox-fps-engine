package net.goofyblox.fps.performance;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.ParticlesMode;

public class DynamicFPSController {

    private static int lastFps = 60;
    private static long lastCheckTime = 0;
    private static final long CHECK_INTERVAL = 5000; // 5 seconds

    public static void init() {
        System.out.println("[Dynamic FPS Controller] Initialized");
    }

    public static void tick() {
        long currentTime = System.currentTimeMillis();
        
        if (currentTime - lastCheckTime < CHECK_INTERVAL) {
            return;
        }
        
        lastCheckTime = currentTime;
        MinecraftClient client = MinecraftClient.getInstance();
        
        if (client == null || client.isPaused()) {
            return;
        }

        int currentFps = client.getCurrentFps();
        
        if (currentFps != lastFps) {
            lastFps = currentFps;
            adjustGraphics(client, currentFps);
        }
    }

    private static void adjustGraphics(MinecraftClient client, int fps) {
        // Aggressive optimization for very low FPS
        if (fps < 20) {
            client.options.getViewDistance().setValue(4);
            client.options.getParticles().setValue(ParticlesMode.MINIMAL);
            client.options.getMaxFramerate().setValue(60);
            System.out.println("[Dynamic FPS] Critical FPS drop detected: " + fps + "fps - Aggressive optimization applied");
        }
        // Moderate optimization for low FPS
        else if (fps < 30) {
            client.options.getViewDistance().setValue(6);
            client.options.getParticles().setValue(ParticlesMode.DECREASED);
            System.out.println("[Dynamic FPS] Low FPS detected: " + fps + "fps - Moderate optimization applied");
        }
        // Restore settings if FPS is good
        else if (fps > 60) {
            client.options.getViewDistance().setValue(12);
            client.options.getParticles().setValue(ParticlesMode.ALL);
            System.out.println("[Dynamic FPS] Good FPS: " + fps + "fps - Graphics restored");
        }
    }
}