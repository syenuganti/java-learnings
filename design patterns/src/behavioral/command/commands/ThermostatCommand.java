package behavioral.command.commands;

import behavioral.command.Command;
import behavioral.command.devices.Thermostat;

public class ThermostatCommand implements Command {
    private final Thermostat thermostat;
    private int prevTemp;
    private final int newTemp;

    public ThermostatCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.newTemp = temperature;
    }

    @Override
    public void execute() {
        prevTemp = thermostat.getTemperature();
        thermostat.setTemperature(newTemp);
    }

    @Override
    public void undo() {
        thermostat.setTemperature(prevTemp);
    }
}
