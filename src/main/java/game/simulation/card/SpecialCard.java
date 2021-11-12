package game.simulation.card;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpecialCard implements Card {
    private String type;
    private BufferedImage image;

    private SpecialCard(String x) throws IOException {
        type = x;
        if(type.equals("Sandbag")){
            image = ImageIO.read(getClass().getClassLoader().getResource("Images/TreasureCards/Card_Sand_Bag.png"));
        }else if(type.equals("HelicopterLift")){
            image = ImageIO.read(getClass().getClassLoader().getResource("Images/TreasureCards/Card_Helicopter.png"));
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
