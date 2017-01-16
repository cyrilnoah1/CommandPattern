package commands;

/**
 * commands.Command interface to execute the data based
 * on the command provided, irrespective of the
 * type of order given.
 */
public interface Command {
    /**
     * Execute whatever command is provided.
     */
    void execute();
}
