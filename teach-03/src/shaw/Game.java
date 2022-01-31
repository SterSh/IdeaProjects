package shaw;

import com.google.gson.Gson;
import java.io.*;

public class Game {

    // Create Local Player Object //
    Player thePlayer;

    // Default Game Class Initializer //
    public Game(Player thePlayer) {
        this.thePlayer = thePlayer;

    }

    // Return Player Data //
    public Player getPlayer() {
        return thePlayer;
    }

    // Save Game Data to Local File //
    public void saveGame(String filename) {
        Gson p = new Gson();
        String playerJson = p.toJson(thePlayer);

        // Try writing game data to local file                        //
        // Catch any possible exceptions and print them into terminal //
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.write(playerJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load Saved Game Data from Local File to new Player Class Object //
    static Game loadGame(String filename) {
        // String for saved Game data read from local file to be sent to //
        String savedGame = null;

        // Try reading data from local save file                      //
        // Catch any possible exceptions and print them into terminal //
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            savedGame = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert save data from Json to Player Object //
        Gson p = new Gson();
        Player newPlayer = p.fromJson(savedGame, Player.class);
        // Initialize new game using read save data    //
        Game newGame = new Game(newPlayer);

        // Return new Game Object //
        return newGame;
    }
}