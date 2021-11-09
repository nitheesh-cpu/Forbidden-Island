package game.simulation.board;
import java.awt.image.BufferedImage;



public class WaterLevelMeter {
    private BufferedImage meter;
    private BufferedImage marker;
    private int[]waterLevelTracker;
    private int position;

    public WaterLevelMeter(){
        waterLevelTracker = new int []{2, 2, 3, 3, 3, 4, 4, 5, 5, 6};
        position = 0;
    }

    public int getLevel(){ return waterLevelTracker[position]; }

    public void setLevel(int increase){
        position += increase;
    }

}
