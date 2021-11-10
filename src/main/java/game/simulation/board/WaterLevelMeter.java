package game.simulation.board;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WaterLevelMeter extends JPanel {
//    private BufferedImage frame = ImageIO.read(getClass().getClassLoader().getResource("Images/FloodMeter/Water_Meter_Frame.png"));
    private int height = 800;
    private int width = 300;
    private BufferedImage levelImg;
    private int waterLevel;
    private int[] waterLevelTracker = {2,2,3,3,3,4,4,4,4,6};

    public WaterLevelMeter(int num) throws IOException {
        waterLevel = num;
        paint(this.getGraphics());
    }

    public int getLevel(){
        return waterLevel;
    }

    public int getNumCards(){
        return waterLevelTracker[waterLevel];
    }
}
