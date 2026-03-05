package net.goofyblox.fps.particles;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.ParticlesMode;

public class ParticleLimiter {

    private static final int MAX_PARTICLES = 1000;
    private static int currentParticleCount = 0;

    public static void init() {
        System.out.println("[Particle Limiter] Enabled with max particles: " + MAX_PARTICLES);
        
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            tick(client);
        });
    }

    private static void tick(MinecraftClient client) {
        if (client.world == null) {
            return;
        }

        // Limit particles based on current FPS
        int fps = client.getCurrentFps();
        
        if (fps < 30) {
            if (client.options.getParticles().getValue() != ParticlesMode.MINIMAL) {
                client.options.getParticles().setValue(ParticlesMode.MINIMAL);
            }
        } else if (fps < 50) {
            if (client.options.getParticles().getValue() != ParticlesMode.DECREASED) {
                client.options.getParticles().setValue(ParticlesMode.DECREASED);
            }
        }
    }
}