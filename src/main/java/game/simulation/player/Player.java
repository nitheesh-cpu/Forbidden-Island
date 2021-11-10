package game.simulation.player;

import game.simulation.board.GameTile;
import game.simulation.card.Card;

import java.util.ArrayList;

public class Player {
    private ArrayList<String> playerDeck;
    private boolean deckFilled;
    private String role;
    private static int moveNumber = 0;
    private boolean hasSunk;
    private GameTile position;
    public Player(String role, ArrayList<String> startingDeck) {
        this.role = role;
        playerDeck = startingDeck;
    }
}
