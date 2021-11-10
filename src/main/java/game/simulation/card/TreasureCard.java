package game.simulation.card;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class TreasureCard implements Card {
    private String type;
    private String color;
    private BufferedImage image;

    public TreasureCard(String x) throws IOException {
        color = x;
        type = "Treasure";

        if(x.equals("Blue")){
            image = ImageIO.read(getClass().getClassLoader().getResource("Images/TreasureCards/Card_Oceans_Chalice.png"));
        }else if(x.equals("Red")){
            image = ImageIO.read(getClass().getClassLoader().getResource("Images/TreasureCards/Card_Crystal_of_Fire.png"));
        }else if(x.equals("Purple")){
            image = ImageIO.read(getClass().getClassLoader().getResource("Images/TreasureCards/Card_Earth_Stone"));
        }else if(x.equals("Yellow")){
            image = ImageIO.read(getClass().getClassLoader().getResource("Images/TreasureCards/Card_Statue_of_the_Wind.png"));
        }
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public BufferedImage getImage() {
        return image;
    }
}
