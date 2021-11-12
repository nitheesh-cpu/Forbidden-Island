package game.simulation;

import game.panel.GameBoard;
import game.simulation.board.GameTile;
import game.simulation.board.TreasurePiece;
import game.simulation.board.WaterLevelMeter;
import game.simulation.card.Card;
import game.simulation.player.Player;

import java.awt.*;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GameState {
    private GameBoard board;
    private int waterLevel;
    private TreasurePiece[] treasuresCollected;
    private int numPlayers;
    private final String[] allRoles;
    private ArrayList<Player> allPlayers;
    private int playerTurn = 0;
    private Player currentPlayer;
    private WaterLevelMeter meter;
    private ArrayList<Card> currentDeck;
    private static Stack<String> cardDeck;
    private static Stack<String> discardPile;
    private ArrayList<GameTile> moveableSpaces;
    private String[] allTiles;
    Iterator<Player> playerIterator;

    public GameState(int difficulty, int numPlayers) throws IOException {
        this.numPlayers = numPlayers;
        allTiles = new String[]{"MistyMarsh", "Observatory", "IronGate", "TidalPalace", "CrimsonForest",
                "BreakersBridge", "CaveOfEmbers", "TwilightHollow", "DunesOfDecepetion",
                "TempleOfTheMoon", "LostLagoon", "CaveOfShadows", "PhantomRock", "SilverGate",
                "Watchtower", "CopperGate", "CliffsOfAbandon", "WhisperingGarden", "TempleOfTheSun",
                "CoralPalace", "GoldGate", "FoolsLanding", "HowlingGarden", "BronzeGate"}
        meter = new WaterLevelMeter(difficulty);
        allRoles = new String[]{"Navigator", "Messenger", "Engineer", "Pilot", "Explorer", "Diver"};
        Random rnd = ThreadLocalRandom.current();
        for (int i = allRoles.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            String a = allRoles[index];
            allRoles[index] = allRoles[i];
            allRoles[i] = a;
        }
        cardDeck = new Stack<>();
        for(int i = 0; i < 4; i++) cardDeck.push("CrystalOfFire");
        for(int i = 0; i < 4; i++) cardDeck.push("StatueOfWind");
        for(int i = 0; i < 4; i++) cardDeck.push("OceansChalice");
        for(int i = 0; i < 4; i++) cardDeck.push("EarthStone");
        for(int i = 0; i < 3; i++) cardDeck.push("HelicopterLift");
        for(int i = 0; i < 2; i++) cardDeck.push("Sandbag");
        Collections.shuffle(cardDeck);
        for(int i = 0; i < numPlayers; i++) {
            ArrayList<String> startingDeck = new ArrayList<>();
            startingDeck.add(cardDeck.pop());
            startingDeck.add(cardDeck.pop());
            Player p = new Player(allRoles[i], startingDeck);
            allPlayers.add(p);
        }
        for(int i = 0; i < 3; i++) cardDeck.push("WatersRise");
        Collections.shuffle(cardDeck);
        playerIterator = allPlayers.iterator();
    }

    public void shuffle(Stack<Card> pile) {
        Collections.shuffle(pile);
    }

    public void drawCard(Graphics g) {
    }

    public void setWater(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public void raiseWater() {
        ++waterLevel;
    }

    public Player nextTurn() {
        if(!playerIterator.hasNext()) playerIterator = allPlayers.iterator();
        return playerIterator.next();
    }

    public void drawFlood(Graphics g) {
    }

    public boolean checkWinning() {
        return true;
    }

    public boolean checkLosing() {
        return true;
    }

    public ArrayList<GameTile> findMovable() {
        String role = currentPlayer.getRole();
        int[] pos = currentPlayer.getPos();
        int x = pos[0];
        int y = pos[1];
        Set<int[]> moveable = new HashSet<>();

        moveable.add(new int[]{x+1,y});
        moveable.add(new int[]{x-1,y});
        moveable.add(new int[]{x, y+1});
        moveable.add(new int[]{x, y-1});
        switch (role) {
            case "Explorer":
                moveable.add(new int[]{x+1,y+1});
                moveable.add(new int[]{x-1,y-1});
                moveable.add(new int[]{x-1, y+1});
                moveable.add(new int[]{x+1, y-1});
                break;
            case "Pilot":
                for(int i = -6; i < 6; i++) {
                    for(int j = -6; j < 6; j++) {
                        moveable.add(new int[]{i, j});
                    }
                }
                break;
            case "Navigator":
                Player temp = currentPlayer;
                currentPlayer =
                Player p =

        }
        ArrayList<GameTile> asdf = new ArrayList<>();

    }

}
