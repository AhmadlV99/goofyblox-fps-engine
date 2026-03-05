# 🎮 Goofyblox FPS Engine

Advanced FPS optimization mod for Minecraft Java Edition 1.21.1 using Fabric Loader.

## ✨ Features

- **Dynamic FPS Controller** - Automatically adjusts graphics settings based on your FPS
- **Particle Limiter** - Intelligently reduces particle effects when FPS drops
- **Chunk Renderer Optimizer** - Optimizes chunk rendering for better performance
- **Real-time Monitoring** - Automatically detects performance drops and responds

## 📋 Requirements

- **Minecraft Version**: 1.21.1
- **Mod Loader**: Fabric Loader 0.15.11+
- **Java**: Java 21+
- **Fabric API**: 0.100.0+

## 🚀 Installation

### Method 1: Using Gradle (Recommended)

```bash
# Clone the repository
git clone https://github.com/AhmadlV99/goofyblox-fps-engine.git
cd goofyblox-fps-engine

# Build the mod
chmod +x gradlew
./gradlew build

# The JAR file will be in: build/libs/goofybloxfps.jar
```

### Method 2: Download Release JAR

Download the latest `goofybloxfps.jar` from [Releases](https://github.com/AhmadlV99/goofyblox-fps-engine/releases)

### Method 3: Install to Minecraft

1. Locate your `.minecraft` folder
2. Create a `mods` folder if it doesn't exist
3. Place `goofybloxfps.jar` inside the `mods` folder
4. Launch Minecraft with Fabric Profile

## 🔧 How It Works

### Dynamic FPS Controller
- Monitors FPS every 5 seconds
- **FPS < 20**: Reduces view distance to 4 chunks, sets particles to MINIMAL
- **FPS < 30**: Reduces view distance to 6 chunks, sets particles to DECREASED
- **FPS > 60**: Restores all settings to maximum

### Particle Limiter
- Automatically caps particles based on current FPS
- Prevents particle spam from impacting performance

### Chunk Renderer Optimizer
- Optimizes chunk rendering pipeline
- Reduces unnecessary chunk updates

## 📦 Project Structure

```
goofyblox-fps-engine/
├── build.gradle
├── gradle.properties
├── settings.gradle
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── net/goofyblox/fps/
        │       ├── GoofybloxFPSMod.java
        │       ├── performance/
        │       │   └── DynamicFPSController.java
        │       ├── particles/
        │       │   └── ParticleLimiter.java
        │       └── optimization/
        │           └── ChunkRendererOptimizer.java
        └── resources/
            └── fabric.mod.json
```

## 🎯 Configuration

Edit settings in the respective class files:

- `DynamicFPSController.java` - Adjust FPS thresholds and check intervals
- `ParticleLimiter.java` - Modify particle limiting logic
- `ChunkRendererOptimizer.java` - Tweak rendering optimization

## 🔄 Building from Source

### Prerequisites
- Git
- JDK 21+
- Gradle (or use gradlew)

### Build Steps

```bash
git clone https://github.com/AhmadlV99/goofyblox-fps-engine.git
cd goofyblox-fps-engine
./gradlew build
```

Output JAR: `build/libs/goofybloxfps-1.0.0.jar`

## 📊 Performance Impact

- **CPU Usage**: Minimal (only checks FPS every 5 seconds)
- **Memory**: <5MB additional
- **Compatibility**: Works with other performance mods

## 🐛 Troubleshooting

### Mod doesn't load
- Ensure Fabric Loader is installed
- Check that Fabric API is in your mods folder
- Verify Minecraft version is 1.21.1

### Settings not applying
- Check server console for error messages
- Ensure you're running in Single Player (mod is client-side only)
- Try deleting Minecraft cache and restarting

## 🚀 Future Enhancements

- [ ] Entity Culling (hide entities behind walls)
- [ ] Multi-threaded chunk building
- [ ] GPU batching optimization
- [ ] Block entity limiter
- [ ] Custom config file
- [ ] In-game settings menu

## 📄 License

MIT License - See LICENSE file for details

## 👨‍💻 Author

**AhmadlV99** - [GitHub Profile](https://github.com/AhmadlV99)

## 🤝 Contributing

Feel free to fork this project and submit pull requests for any improvements!

## 📞 Support

For issues, bugs, or feature requests, please open an [Issue](https://github.com/AhmadlV99/goofyblox-fps-engine/issues)

---

**Made with ❤️ for the Minecraft community**