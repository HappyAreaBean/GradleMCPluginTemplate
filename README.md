# GradleMCPluginTemplate

GradleMCPluginTemplate is a simple template for Spigot/Paper plugin development. 
It is set up with Gradle 8.0 and includes the following features:

## Features

### run-paper

The template provides a streamlined method of integration testing plugins using the `runServer` Gradle task.

#### Flexible options for run-paper

- `runPaper.runDirectory`: Customize the run directory for integration testing.
- `runPaper.serverJar`: Customize the server JAR used in the `runPaper` task.

### spigradle

The template utilizes the `spigradle` plugin for generating the `plugin.yml` file.

### shadow Jar plugin

The template includes the `shadow` plugin, allowing you to build a shadow JAR for your plugin. The shadow JAR contains
all the required dependencies within a single JAR file.

## Usage

1. Clone or download the GradleMCPluginTemplate repository.
2. Customize the plugin according to your needs.
3. Build and package your plugin using the provided Gradle tasks.
4. Test your plugin using the `runServer` task.
5. Distribute your plugin by using the generated JAR file.

## Getting Started

Follow these steps to get started with the GradleMCPluginTemplate:

1. Ensure you have Gradle 8.0 or later installed.
2. Clone or download this repository.
3. Customize the plugin as per your requirements.
4. Run `gradle build` (or `gradle shadowJar` for shadow) to compile and build the plugin.
5. Run `gradle runServer` to start the server with your plugin for testing.

For more information on Gradle tasks and options, refer to the project's documentation.

## License

This project is licensed under the [The Unlicense](LICENSE).

have fun :)