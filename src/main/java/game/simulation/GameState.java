package game.simulation;

import game.panel.GameBoard;
import game.simulation.board.GameTile;
import game.simulation.board.TreasurePiece;
import game.simulation.board.WaterLevelMeter;
import game.simulation.card.Card;
import game.simulation.player.Player;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class GameState {
    private GameBoard board;
    private int waterLevel;
    private TreasurePiece[] treasuresCollected;
    private int numPlayers;
    private String[] allRoles;
    private final ArrayList<Player> allPlayers;
    private static int playerTurn = 0;
    private Player currentPlayer;
    private WaterLevelMeter meter;
    private ArrayList<Card> currentDeck;
    private static Stack<Card> cardDeck;
    private static Stack<Card> discardPile;
    private ArrayList<GameTile> moveableSpaces;

    public GameState(int difficulty, int numPlayers) {
        this.numPlayers = numPlayers;
        meter = new WaterLevelMeter();
        waterLevel = meter.getWaterLevel();

    }

    public void shuffle(Stack<Card> pile) {
        Collections.shuffle(pile);
    }

    public void drawCard(Graphics g) {
    }

    public void setWater(int waterLevel) {
    }

    public void raiseWater() {
    }

    public Player nextTurn() {
        return
    }

    public void drawFlood(Graphics g) {
    }

    public boolean checkWinning() {
        return true;
    }

    public boolean checkLosing() {
        return true;
    }

    public void showHelp() {
    }

    public ArrayList<GameTile> findMovable() {
        return moveableSpaces;
    }

}
