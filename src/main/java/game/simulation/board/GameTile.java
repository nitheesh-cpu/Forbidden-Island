package game.simulation.board;

import java.awt.image.BufferedImage;

public class GameTile {
    private String name;
    private BufferedImage tile;
    private int[] position;
    private boolean isFlooded;
    private boolean isTreasure;
    private boolean isStarting;


    public GameTile(){
        name = "";
        position = new int[0];
        isFlooded = false;
        isTreasure = false;
        isStarting = false;
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
