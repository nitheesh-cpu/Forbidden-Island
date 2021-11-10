package game.simulation.card;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class SpecialCard implements Card {
    private String type;
    private BufferedImage image;

    private SpecialCard(String x) throws IOException {
        type = x;
        if(x == "helicopter") image = ImageIO.read(getClass().getClassLoader().getResource("Images/TreasureCards/Card_Helicopter.png"));
        if(x == "sandbag")    image = ImageIO.read(getClass().getClassLoader().getResource("Images/TreasureCards/Card_Sand_Bag.png"));

    }
}
