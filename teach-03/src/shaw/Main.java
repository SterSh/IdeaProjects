package shaw;

import com.google.gson.Gson;

public class Main {

    static String Save_Game = "saveData.txt";

    public static void main(String[] args) {
        // write your code here
        // Implement First Player and First Game

        /* Create new Player with the Players name, /
        / health, mana, and gold added into        /
        / created class to hold data.             */
        Player thePlayer = new Player("Derrick", 10,20, 100);
        System.out.println("First Game Data: ");
        System.out.println(thePlayer.toString());

        // Save Game Data to local save file
        Game firstGame = new Game(thePlayer);
        firstGame.saveGame(Save_Game);

        // Start a new game used saved data from past game
        Game newGame = Game.loadGame(Save_Game);
        System.out.println("Second Game Data: ");
        System.out.println(newGame.getPlayer());

        // Stretch Challenges //

        // Implement equipment map to store equipment keys and data to Player class //
        thePlayer.addEquipment("Dagger", 1);
        thePlayer.addEquipment("Cloak", 2);
        thePlayer.addEquipment("Backpack", 100);


        // Run Checks to make sure data is being changed correctly //
        System.out.println("Checking First Game Data Changes: " + thePlayer.toString());

        // Save game changes onto local save file //
        firstGame.saveGame(Save_Game);

        // Create new game using local save data. //
        Game finalGame = Game.loadGame(Save_Game);

        // Check to make sure save data changes from stretch challenge carried over correctly //
        System.out.println("Final Game Data: ");
        System.out.println(finalGame.getPlayer());


    }
}
