package game.simulation.board;

import java.awt.image.BufferedImage;

public class GameTile {
    private String name;
    private BufferedImage tile;
    private int[] position;
    private boolean isFlooded;
    private boolean isTreasure;
    private boolean isStarting;


    public GameTile(String str, BufferedImage img) {
        name = str;
        tile = img;
        isFlooded = false;
        isTreasure = str.equals("Cave of Shadows") || str.equals("Tidal Palace") || str.equals("Whispering Garden") ||
                str.equals("Temple of the Moon") || str.equals("Cave of Embers") || str.equals("Coral Palace") ||
                str.equals("Temple of the Sun") || str.equals("Howling Garden");
        isStarting = str.equals("Fools Landing") || str.equals("Iron Gate") || str.equals("Bronze Gate") || str.equals("Gold Gate") || str.equals("Copper Gate");
    }

    public String getName(){
        return name;
    }

    public int[] getPosition(){
        return position;
    }

    public boolean getFloodState(){
        return isFlooded;
    }

    public void setFlooded(boolean floodState){
        this.isFlooded = floodState;
    }

    public boolean getTreasureState(){
        return isTreasure;
    }

    public boolean getStarting(){
        return isStarting;
    }


}
