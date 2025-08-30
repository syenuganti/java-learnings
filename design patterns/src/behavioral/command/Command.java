package behavioral.command;

/**
 * Base Command interface defining the contract for all commands
 */
public interface Command {
    void execute();
    void undo();
}
