package game.simulation.player;
//import game.simulation.GameState;
import game.simulation.board.GameTile;
import game.simulation.card.Card;
import game.simulation.card.TreasureCard;

//import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player
{
    private ArrayList<Card> playerDeck;
    private boolean deckFilled, hasSunk;
    private String role;
    private int moveNumber;
    private int[] position;

    public Player(String role, ArrayList<String> deck)
    {

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

    public void disposeTreasure(TreasureCard c)
    {
        ArrayList<Card> player = this.playerDeck;


        for(Card card: player)
        {
            if(card == c)
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
        ArrayList<Card> player = this.playerDeck;
        if(deckFilled)
        {
           player.remove(player.size()-1);
        }
    }

    public ArrayList<Card> getDeck()
    {
        return playerDeck;
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
}
