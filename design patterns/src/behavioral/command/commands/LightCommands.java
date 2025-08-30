package behavioral.command.commands;

import behavioral.command.Command;
import behavioral.command.devices.Light;

/**
 * Light-related commands implementation
 */
public class LightCommands {
    public static class LightOnCommand implements Command {
        private final Light light;

        public LightOnCommand(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            light.turnOn();
        }

        @Override
        public void undo() {
            light.turnOff();
        }
    }

    public static class LightOffCommand implements Command {
        private final Light light;

        public LightOffCommand(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            light.turnOff();
        }

        @Override
        public void undo() {
            light.turnOn();
        }
    }

    public static class DimLightCommand implements Command {
        private final Light light;
        private int prevLevel;
        private final int newLevel;

        public DimLightCommand(Light light, int level) {
            this.light = light;
            this.newLevel = level;
        }

        @Override
        public void execute() {
            prevLevel = light.getIntensity();
            light.dim(newLevel);
        }

        @Override
        public void undo() {
            light.dim(prevLevel);
        }
    }
}
