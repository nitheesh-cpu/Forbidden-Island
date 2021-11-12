package game.panel;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class DefeatPanel extends JFrame
{
    private Font PNBold;
    private final int WIDTH = 300, HEIGHT = 300;

    public DefeatPanel(String title)
    {
        super(title);
        setResizable(false);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        try
        {
            PNBold = Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("Fonts/Proxima Nova Bold.otf"))).deriveFont(25f);
        } catch (FontFormatException | IOException e) {
            System.out.println("Error");
        }
    }

    public void paint(Graphics g)
    {
        g.setFont(PNBold);
        g.drawString("YOU LOSE!", getWidth()/2, getHeight()/2);
    }
}
