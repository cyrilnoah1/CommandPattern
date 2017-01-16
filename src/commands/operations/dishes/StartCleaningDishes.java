package commands.operations.dishes;

import commands.Command;
import commands.operations.clothes.CleanClothes;

/**
 * Command to start cleaning clothes.
 */
public class StartCleaningDishes implements Command {
    CleanDishes cleanDishes;

    public StartCleaningDishes(CleanDishes cleanDishes) {
        this.cleanDishes = cleanDishes;
    }

    @Override
    public void execute() {
        cleanDishes.start();
    }
}
