package game.simulation.card;

import java.awt.image.BufferedImage;

public class SpecialCard implements Card {
    private String type;
    private BufferedImage image;

    private SpecialCard(String x) {
        type = x;
//        image = Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("Images"));
    }
}
