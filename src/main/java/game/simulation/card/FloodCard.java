package game.simulation.card;

import java.awt.image.BufferedImage;

public class FloodCard {
    private String tile;
    private BufferedImage card;

    public FloodCard(String name, BufferedImage img) {
        tile = name;
        card = img;
    }
}
