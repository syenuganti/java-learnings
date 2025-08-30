package behavioral.command;

/**
 * RemoteControl acts as the invoker in the Command pattern.
 * It holds commands and executes them when requested.
 */
public class RemoteControl {
    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand;
    private static final int SLOT_COUNT = 7;

    public RemoteControl() {
        onCommands = new Command[SLOT_COUNT];
        offCommands = new Command[SLOT_COUNT];

        // Initialize with NoCommand to avoid null checks
        Command noCommand = new NoCommand();
        for (int i = 0; i < SLOT_COUNT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }
}

/**
 * NoCommand implements the null object pattern
 */
class NoCommand implements Command {
    @Override
    public void execute() {
        // Do nothing
    }

    @Override
    public void undo() {
        // Do nothing
    }
}
