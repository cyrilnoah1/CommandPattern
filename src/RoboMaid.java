import commands.Command;

/**
 * RoboMaid to take commands from the user and
 * then execute the given command.
 */
public class RoboMaid {
    private Command command;

    /**
     * To give maid a task that needs to be completed.
     *
     * @param command Task that needs to be executed by the maid.
     */
    public void giveTask(Command command) {
        this.command = command;
    }

    /**
     * Completed the given task.
     */
    public void completeTask() {
        try {
            command.execute();
        } catch (NullPointerException nPE) {
            nPE.printStackTrace();
        }
    }
}
