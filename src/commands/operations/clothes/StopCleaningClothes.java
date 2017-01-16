package commands.operations.clothes;

import commands.Command;

/**
 * Command to start cleaning clothes.
 */
public class StopCleaningClothes implements Command {
    CleanClothes cleanClothes;

    public StopCleaningClothes(CleanClothes cleanClothes) {
        this.cleanClothes = cleanClothes;
    }

    @Override
    public void execute() {
        cleanClothes.stop();
    }
}
