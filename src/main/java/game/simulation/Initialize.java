package game.simulation;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public class Initialize {
    public static Map<String, BufferedImage> treasures;
    public static Map<String, BufferedImage> floodcards;
    public static Map<String, BufferedImage> treasurecards;
    public static Map<String, BufferedImage> tiles;
    public static ArrayList tilesList = new ArrayList(Arrays.asList("Breakers Bridge", "Bronze Gate", "Cave of Embers", "Cave of Shadows", "Cliffs of Abandon", "Copper Gate", "Coral Palace", "Crimson Forest", "Dunes of Deception", "Fools Landing", "Gold Gate", "Howling Garden", "Iron Gate", "Lost Lagoon", "Misty Marsh", "Observatory", "Phantom Rock", "Silver Gate", "Temple of the Moon", "Temple of the Sun", "Tidal Palace", "Twilight Hollow", "Watchtower", "Whispering Garden"));
    public static Map.Entry waterrise;

    public static void init() throws IOException {

        waterrise = Map.entry("WaterRise", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/TreasureCards/Card_Waters_Rise.png"))));

        treasures = Map.ofEntries(
                Map.entry("Blue", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Treasures/EAU.png")))),
                Map.entry("Red", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Treasures/FEU.png")))),
                Map.entry("Purple", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Treasures/TERRE.png")))),
                Map.entry("Yellow", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Treasures/AIR.png"))))
        );

        floodcards = Map.ofEntries(
                Map.entry("Beakers Bridge", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Breakers Bridge@2x.png")))),
                Map.entry("Bronze Gate", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Bronze Gate@2x.png")))),
                Map.entry("Cave of Embers", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Cave of Embers@2x.png")))),
                Map.entry("Cave of Shadows", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Cave of Shadows@2x.png")))),
                Map.entry("Cliffs of Abandon", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Cliffs of Abandon@2x.png")))),
                Map.entry("Copper Gate", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Copper Gate@2x.png")))),
                Map.entry("Coral Palace", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Coral Palace@2x.png")))),
                Map.entry("Crimson Forest", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Crimson Forest@2x.png")))),
                Map.entry("Dunes of Deception", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Dunes of Deception@2x.png")))),
                Map.entry("Fools Landing", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Fools_ Landing@2x.png")))),
                Map.entry("Gold Gate", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Gold Gate@2x.png")))),
                Map.entry("Howling Garden", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Howling Garden@2x.png")))),
                Map.entry("Iron Gate", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Iron Gate@2x.png")))),
                Map.entry("Lost Lagoon", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Lost Lagoon@2x.png")))),
                Map.entry("Misty Marsh", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Misty Marsh@2x.png")))),
                Map.entry("Observatory", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Observatory@2x.png")))),
                Map.entry("Phantom Rock", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Phantom Rock@2x.png")))),
                Map.entry("Silver Gate", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Silver Gate@2x.png")))),
                Map.entry("Temple of the Moon", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Temple of the Moon@2x.png")))),
                Map.entry("Temple of the Sun", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Temple of the Sun@2x.png")))),
                Map.entry("Tidal Palace", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Tidal Palace@2x.png")))),
                Map.entry("Twilight Hollow", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Twilight Hollow@2x.png")))),
                Map.entry("Watchtower", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Watchtower@2x.png")))),
                Map.entry("Whispering Garden", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/FloodCards/Flood_Card_Whispering Garden@2x.png"))))
        );

        treasurecards = Map.ofEntries(
                Map.entry("Blue", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/TreasureCards/Card_Oceans_Chalice.png")))),
                Map.entry("Red", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/TreasureCards/Card_Crystal_of_Fire.png")))),
                Map.entry("Purple", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/TreasureCards/Card_Earth_Stone")))),
                Map.entry("Yellow", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/TreasureCards/Card_Statue_of_the_Wind.png"))))
        );

        tiles = Map.ofEntries(
                Map.entry("Breakers Bridge", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Breakers Bridge@2x.png")))),
                Map.entry("Breakers Bridge Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Breakers Bridge_flood@2x.png")))),
                Map.entry("Bronze Gate", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Bronze Gate@2x.png")))),
                Map.entry("Bronze Gate Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Bronze Gate_flood@2x.png")))),
                Map.entry("Cave of Embers", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Cave of Embers@2x.png")))),
                Map.entry("Cave of Embers Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Cave of Embers_flood@2x.png")))),
                Map.entry("Cave of Shadows", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Cave of Shadows@2x.png")))),
                Map.entry("Cave of Shadows Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Cave of Shadows_flood@2x.png")))),
                Map.entry("Cliffs of Abandon", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Cliffs of Abandon@2x.png")))),
                Map.entry("Cliffs of Abandon Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Cliffs of Abandon_flood@2x.png")))),
                Map.entry("Copper Gate", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Copper Gate@2x.png")))),
                Map.entry("Copper Gate Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Copper Gate_flood@2x.png")))),
                Map.entry("Coral Palace", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Coral Palace@2x.png")))),
                Map.entry("Coral Palace Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Coral Palace_flood@2x.png")))),
                Map.entry("Crimson Forest", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Crimson Forest@2x.png")))),
                Map.entry("Crimson Forest Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Crimson Forest_flood@2x.png")))),
                Map.entry("Dunes of Deception", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Dunes of Deception@2x.png")))),
                Map.entry("Dunes of Deception Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Dunes of Deception_flood@2x.png")))),
                Map.entry("Fools Landing", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Fools_ Landing@2x.png")))),
                Map.entry("Fools Landing Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Fools_ Landing_flood@2x.png")))),
                Map.entry("Gold Gate", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Gold Gate@2x.png")))),
                Map.entry("Gold Gate Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Gold Gate_flood@2x.png")))),
                Map.entry("Howling Garden", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Howling Garden@2x.png")))),
                Map.entry("Howling Garden Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Howling Garden_flood@2x.png")))),
                Map.entry("Iron Gate", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Iron Gate@2x.png")))),
                Map.entry("Iron Gate Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Iron Gate_flood@2x.png")))),
                Map.entry("Lost Lagoon", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Lost Lagoon@2x.png")))),
                Map.entry("Lost Lagoon Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Lost Lagoon_flood@2x.png")))),
                Map.entry("Misty Marsh", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Misty Marsh@2x.png")))),
                Map.entry("Misty Marsh Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Misty Marsh_flood@2x.png")))),
                Map.entry("Observatory", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Observatory@2x.png")))),
                Map.entry("Observatory Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Observatory_flood@2x.png")))),
                Map.entry("Phantom Rock", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Phantom Rock@2x.png")))),
                Map.entry("Phantom Rock Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Phantom Rock_flood@2x.png")))),
                Map.entry("Silver Gate", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Silver Gate@2x.png")))),
                Map.entry("Silver Gate Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Silver Gate_flood@2x.png")))),
                Map.entry("Temple of the Moon", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Temple of the Moon@2x.png")))),
                Map.entry("Temple of the Moon Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Temple of the Moon_flood@2x.png")))),
                Map.entry("Temple of the Sun", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Temple of the Sun@2x.png")))),
                Map.entry("Temple of the Sun Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Temple of the Sun_flood@2x.png")))),
                Map.entry("Tidal Palace", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Tidal Palace@2x.png")))),
                Map.entry("Tidal Palace Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Tidal Palace_flood@2x.png")))),
                Map.entry("Twilight Hollow", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Twilight Hollow@2x.png")))),
                Map.entry("Twilight Hollow Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Twilight Hollow_flood@2x.png")))),
                Map.entry("Watchtower", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Watchtower@2x.png")))),
                Map.entry("Watchtower Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Watchtower_flood@2x.png")))),
                Map.entry("Whispering Garden", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Whispering Garden@2x.png")))),
                Map.entry("Whispering Garden Flooded", ImageIO.read(Objects.requireNonNull(Initialize.class.getClassLoader().getResource("Images/Tiles/Whispering Garden_flood@2x.png"))))
        );

    }
}
