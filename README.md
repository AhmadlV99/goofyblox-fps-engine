# 🚀 Goofyblox FPS Engine

> Advanced FPS optimization mod for **Minecraft Java 1.21.1** using **Fabric**

---

## ✨ Features

| Module | Description |
|---|---|
| 🎯 **Dynamic FPS Controller** | Auto-adjusts graphics based on current FPS |
| 🌫️ **Particle Limiter** | Reduces particles when FPS drops critically |
| 👁️ **Entity Culling** | Skips rendering entities behind camera or too far |
| 📦 **Chunk Optimizer** | Multi-threaded chunk building with adaptive thread count |
| 🧱 **Block Entity Limiter** | Limits chest/furnace render distance to save FPS |

---

## ⚡ FPS Tiers (Dynamic Controller)

| FPS | Action |
|---|---|
| **≥ 60** | Restore balanced settings (view dist 12, fancy graphics) |
| **< 60** | Reduce view distance to 8 |
| **< 40** | View dist 6, disable clouds |
| **< 30** | View dist 4, decreased particles |
| **< 20** | 🚨 Emergency: View dist 2, fastest graphics, no particles |

---

## 📦 Project Structure

```
goofyblox-fps-engine/
│
├─ build.gradle
├─ gradle.properties
├─ settings.gradle
│
└─ src/main/
    ├─ java/net/goofyblox/fps/
    │   ├─ GoofybloxFPSMod.java           ← Main entry
    │   ├─ performance/
    │   │   └─ DynamicFPSController.java  ← Auto graphics adjuster
    │   ├─ particles/
    │   │   └─ ParticleLimiter.java       ← Particle cap
    │   ├─ culling/
    │   │   └─ EntityCullingManager.java  ← Entity culling
    │   ├─ chunk/
    │   │   └─ ChunkOptimizer.java        ← Multi-thread chunks
    │   └─ entity/
    │       └─ BlockEntityLimiter.java    ← Tile entity limiter
    │
    └─ resources/
        ├─ fabric.mod.json
        └─ goofybloxfps.mixins.json
```

---

## 🔨 Build Instructions

### Requirements
- Java 21+
- Gradle (included via wrapper)

### Build

```bash
# Clone the repo
git clone https://github.com/Goofyblox/goofyblox-fps-engine.git
cd goofyblox-fps-engine

# Build
chmod +x gradlew
./gradlew build

# Output JAR:
# build/libs/goofybloxfps-1.0.0.jar
```

### Install
Copy the JAR to your `.minecraft/mods/` folder.

---

## 📱 Build on Mobile (Termux)

```bash
pkg install openjdk-21
git clone https://github.com/Goofyblox/goofyblox-fps-engine.git
cd goofyblox-fps-engine
chmod +x gradlew
./gradlew build
```

---

## 🛠️ Planned Upgrades

- [ ] Full frustum culling with Mixin hooks
- [ ] GPU batch rendering
- [ ] Configurable settings screen (Mod Menu integration)
- [ ] Per-dimension optimization profiles
- [ ] Config file (JSON/TOML)

---

## 📄 License

MIT License — free to use, modify, and distribute.

---

## 👤 Author

**Goofyblox**
