package game.simulation.board;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class WaterLevelMeter extends JPanel {
    private BufferedImage frame = ImageIO.read(new File(getClass().getClassLoader().getResource("Images/TitleScreen.png")));
    private int height = 800;
    private int width = 300;
    private BufferedImage levelImg;
    private int waterLevel;
    private int[] waterLevelTracker = {2,2,3,3,3,4,4,4,4,6};
    public WaterLevelMeter(int num){
        waterLevel = num;
        paint(this.getGraphics());
    }
    public int getLevel(){
        return waterLevel;
    }
    public int getNumCards(){
        return waterLevelTracker[waterLevel];
    }
    public void paint(Graphics g){

    }
}
