package game.simulation.player;
//import game.simulation.GameState;
import game.simulation.board.GameTile;
import game.simulation.card.Card;
import game.simulation.card.TreasureCard;

//import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player
{
    private ArrayList<String> playerDeck;
    private boolean deckFilled, hasSunk;
    private String role;
    private int moveNumber;
    private int[] position;

    public Player(String role, ArrayList<String> startingDeck)
    {
        playerDeck = startingDeck;
        deckFilled = false;
        hasSunk = false;
        this.role = role;
        moveNumber = 0;
        position = new int[2];
    }

    public void drawCard()
    {

    }

    public void updatePosition()
    {

    }

    public void disposeTreasure(String treasure)
    {
        ArrayList<String> player = this.playerDeck;

        for(String card: player)
        {
            if(card == treasure)
            {
                player.remove(card);
            }
        }
    }

    public void setDeckFilled(boolean deckFilled) {
        this.deckFilled = deckFilled;
    }

    public void disposeCard()
    {
        ArrayList<String> player = this.playerDeck;
        if(deckFilled)
        {
           player.remove(player.size()-1);
        }
    }

    public ArrayList<String> getDeck()
    {
        return playerDeck;
    }


    public void giveTreasure(String treasure, Player send, Player receive)
    {
        ArrayList<String> rec = receive.getDeck();
        ArrayList<String> sen = send.getDeck();

        for(String card: sen)
        {
            if(card == treasure)
            {
                sen.remove(card);
                rec.add(card);
                break;
            }
        }
    }

    public void shoreUp(GameTile tile)
    {
        tile.setFlooded(false);

    }

    public void movePawn(int[] pos)
    {
        position = pos;

    }

    public int[] getPos()
    {
        return position;
    }

    public int getMoveNumber()
    {
        return moveNumber;
    }

    public void setMoveNumber(int moveNumber) {
        this.moveNumber = moveNumber;
    }

    public String getRole() {
        return role;
    }

    public void setPosition(int[] pos) {
        position = pos;
    }
}
