import commands.operations.clothes.CleanClothes;
import commands.operations.clothes.StartCleaningClothes;
import commands.operations.clothes.StopCleaningClothes;
import commands.operations.dishes.CleanDishes;
import commands.operations.dishes.StartCleaningDishes;
import commands.operations.dishes.StopCleaningDishes;

/**
 * Class containing the main method.
 */
public class MainClass {

    /**
     * Main method.
     *
     * @param arg String arguments.
     */
    public static void main(String arg[]) {
        // Giving Chitti the Robo some work to do.
        maidOperations();
    }

    /**
     * Operations to be done by maid.
     */
    private static void maidOperations() {
        CleanDishes cleanDishes = new CleanDishes();
        CleanClothes cleanClothes = new CleanClothes();

        // Clothes' operations.
        StartCleaningClothes startCleaningClothes = new StartCleaningClothes(cleanClothes);
        StopCleaningClothes stopCleaningClothes = new StopCleaningClothes(cleanClothes);

        // Dishes' operations.
        StartCleaningDishes startCleaningDishes = new StartCleaningDishes(cleanDishes);
        StopCleaningDishes stopCleaningDishes = new StopCleaningDishes(cleanDishes);

       /*  Before you wonder about how he can start
         both operations without finishing another,
         remember that he's "Chitti the Robo".*/
        RoboMaid chittiTheRobo = new RoboMaid();
        chittiTheRobo.giveTask(startCleaningClothes);
        chittiTheRobo.completeTask();
        chittiTheRobo.giveTask(startCleaningDishes);
        chittiTheRobo.completeTask();

        chittiTheRobo.giveTask(stopCleaningClothes);
        chittiTheRobo.completeTask();
        chittiTheRobo.giveTask(stopCleaningDishes);
        chittiTheRobo.completeTask();
    }
}
