package commands.operations.clothes;

import commands.Command;

/**
 * Command to start cleaning clothes.
 */
public class StartCleaningClothes implements Command {
    CleanClothes cleanClothes;

    public StartCleaningClothes(CleanClothes cleanClothes) {
        this.cleanClothes = cleanClothes;
    }

    @Override
    public void execute() {
        cleanClothes.start();
    }
}
