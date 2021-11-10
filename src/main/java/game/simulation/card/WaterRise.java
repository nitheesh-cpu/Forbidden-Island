package game.simulation.card;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class WaterRise implements Card {
    private String type;
    private BufferedImage image;

    public WaterRise() throws IOException {
        type = "WatersRise";
        image = ImageIO.read(getClass().getClassLoader().getResource("Images/TreasureCards/Card_Waters_Rise.png"));
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
