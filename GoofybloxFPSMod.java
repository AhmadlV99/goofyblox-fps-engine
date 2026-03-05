package net.goofyblox.fps;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.goofyblox.fps.performance.DynamicFPSController;
import net.goofyblox.fps.particles.ParticleLimiter;
import net.goofyblox.fps.optimization.ChunkRendererOptimizer;

public class GoofybloxFPSMod implements ClientModInitializer {

    public static final String MOD_ID = "goofybloxfps";
    public static final String MOD_NAME = "Goofyblox FPS Engine";

    @Override
    public void onInitializeClient() {
        System.out.println("[" + MOD_NAME + "] Initializing...");
        
        // Initialize performance optimization modules
        DynamicFPSController.init();
        ParticleLimiter.init();
        ChunkRendererOptimizer.init();
        
        // Register client tick events
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            DynamicFPSController.tick();
        });

        System.out.println("[" + MOD_NAME + "] Loaded successfully!");
    }
}