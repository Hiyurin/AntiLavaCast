![Banner](https://repobeats.axiom.co/api/embed/a681660d33b84ec87d042a61f0a867674fc06a0e.svg "Repobeats analytics image")

# AntiLavaCast Plugin

AntiLavaCast is a Minecraft plugin designed to prevent the creation of cobblestone from lava, thus stopping the lavacasting technique in the game.


## [Folia](https://papermc.io/software/folia) Support

If you are using [Folia](https://papermc.io/software/folia), ensure that your Folia version is compatible with your PaperMC version. AntiLavaCast supports Folia and can work on compatible versions. To ensure compatibility, check the [Folia](https://papermc.io/software/folia) documentation and guidelines..

## Installation
- Requirement: ``java 21``

1. Download: Download the plugin's JAR file from the [actions page](https://github.com/Hiyurin/AntiLavaCast/actions) or [Hangar](https://hangar.papermc.io/Hiyurin/AntiLavaCast).
2. Place JAR file: Place the JAR file in the ``plugins`` folder of your PaperMC or Folia Minecraft server.
3. Restart: Restart the server.

## Configuration

The plugin does not require additional configuration. After installation, it will automatically prevent cobblestone creation from lava.

## Building the Plugin

To build the plugin from source code, follow these steps:
- Requirement: ``java 21`` & [Gradle](https://gradle.org/install/)
### Download Source Code
1. **[Download Source Code](https://github.com/Hiyurin/AntiLavaCast/releases)**

2. **Navigate to the source code directory**:
   ```sh
   cd AntiLavaCast
   ```
### Install Gradle

1. **Install Gradle**:
   - Visit the [Gradle installation](https://gradle.org/install/) page to download and install Gradle..
   - Installation on **Github workspace** / **Linux**
   ```sh
   gradle wrapper
   ```


###  Build the Plugin
 **Run the build command**: Use Gradle to build the plugin
   ```sh
   gradle build
```
> After a successful build, the plugin's JAR file will be created in the ``build/libs``  directory.

# License
 The plugin is released under the [GNU License v3](https://github.com/Hiyurin/AntiLavaCast/blob/main/LICENSE).
