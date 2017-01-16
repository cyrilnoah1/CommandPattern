package commands.operations.dishes;

import commands.Command;

/**
 * Command to start cleaning clothes.
 */
public class StopCleaningDishes implements Command {
    CleanDishes cleanDishes;

    public StopCleaningDishes(CleanDishes cleanDishes) {
        this.cleanDishes = cleanDishes;
    }

    @Override
    public void execute() {
        cleanDishes.stop();
    }
}
