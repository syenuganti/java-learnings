package behavioral.command;

import behavioral.command.commands.LightCommands.*;
import behavioral.command.commands.ThermostatCommand;
import behavioral.command.devices.Light;
import behavioral.command.devices.Thermostat;

/**
 * Demonstrates how to use the Command pattern with a smart home system
 */
public class SmartHomeDemo {
    public static void main(String[] args) {
        // Create the receiver objects (smart devices)
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Thermostat thermostat = new Thermostat();

        // Create commands for the devices
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command dimLivingRoom = new DimLightCommand(livingRoomLight, 50);
        Command setTemp = new ThermostatCommand(thermostat, 22);

        // Create the invoker (remote control)
        RemoteControl remote = new RemoteControl();

        // Setup the remote control slots
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);   // Slot 0: Living Room Light
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);         // Slot 1: Kitchen Light
        remote.setCommand(2, dimLivingRoom, livingRoomLightOn);        // Slot 2: Living Room Dimmer
        remote.setCommand(3, setTemp, new NoCommand());                // Slot 3: Thermostat

        // Demonstrate using the remote control
        System.out.println("=== Testing Smart Home Commands ===");

        System.out.println("\nTesting Living Room Light:");
        remote.onButtonPressed(0);   // Turn on living room light
        remote.undoButtonPressed();  // Undo - turn off living room light
        remote.offButtonPressed(0);  // Turn off living room light

        System.out.println("\nTesting Kitchen Light:");
        remote.onButtonPressed(1);   // Turn on kitchen light
        remote.offButtonPressed(1);  // Turn off kitchen light

        System.out.println("\nTesting Dimmer:");
        remote.onButtonPressed(2);   // Dim living room light
        remote.undoButtonPressed();  // Undo - restore previous brightness

        System.out.println("\nTesting Thermostat:");
        remote.onButtonPressed(3);   // Set temperature
    }
}
