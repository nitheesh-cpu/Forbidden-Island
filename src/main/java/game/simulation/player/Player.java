package game.simulation.player;
import game.simulation.GameState;
import game.simulation.board.GameTile;
import game.simulation.card.Card;
import game.simulation.card.TreasureCard;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player
{
    private ArrayList<Card> playerDeck;
    private boolean deckFilled, hasSunk;
    private String role;
    private int moveNumber;
    private int[] position;

    public Player(String role)
    {
        playerDeck = new ArrayList<Card>();
        deckFilled = false;
        hasSunk = false;
        this.role = role;
        moveNumber = 0;
        position = new int[6];
    }

    public void drawCard()
    {

    }

    public void updatePosition()
    {

    }

    public void disposeTreasure(TreasureCard c, Player p)
    {
        ArrayList<Card> player = p.getDeck();
        for(Card card: player)
        {
            if(card == c)
            {
                player.remove(card);
            }
        }
    }

    public void disposeCard()
    {
        if(deckFilled)
        {

        }
    }

    public ArrayList<Card> getDeck()
    {
        return playerDeck;
    }

    public int[] getPos()
    {
        return position;
    }

    public void giveTreasure(TreasureCard c, Player send, Player receive)
    {
        ArrayList<Card> rec = receive.getDeck();
        ArrayList<Card> sen = send.getDeck();

        for(Card card: sen)
        {
            if(card == c)
            {
                sen.remove(card);
                rec.add(card);
            }
        }
    }

    public void shoreUp(GameTile tile)
    {

    }

    public void movePawn(int[][] coords)
    {

    }

    public int getMoveNumber()
    {
        return moveNumber;
    }
}
