package game.panel;

import game.simulation.GameState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;


public class MenuPanel extends JFrame {
    private Font Kurale, PNBold, PNRegular;
    private HelpPanel helpPanel = null;
    private ParentPanel parentPanel;

    public MenuPanel(ParentPanel p) {
        super("Forbidden Island Menu");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setLayout(new BorderLayout());
        Dimension size = new Dimension(1010, 535);
        setSize(size);
        setPreferredSize(size);
        setMinimumSize(size);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getClass().getClassLoader();
        parentPanel = p;
        try {
            Kurale = Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("Fonts/Kurale-Regular.ttf"))).deriveFont(12f);
            PNBold = Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("Fonts/Proxima Nova Bold.otf"))).deriveFont(15f);
            PNRegular = Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("Fonts/ProximaNova-Regular.otf"))).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Kurale);
        } catch (FontFormatException | IOException e) {
            System.out.println("Error");
        }

        setLayout(new BorderLayout());
        JLabel background = new JLabel();
        background.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/TitleScreen.png")));
        add(background);
        background.setLayout(null);
        //difficulty input field
        JLabel difficultyLabel = new JLabel("Difficulty:");
        String[] difficultyStrings = {"--Select--", "Novice", "Normal", "Elite", "Legendary"};
        JComboBox difficultyDropdown = new JComboBox(difficultyStrings);
        difficultyLabel.setBounds(161, 270, 149, 25);
        difficultyLabel.setFont(PNBold);
//        difficultyLabel.setOpaque(true);
        difficultyLabel.setBackground(new Color(191, 105, 86));
        difficultyLabel.setForeground(new Color(255, 255, 255));
        difficultyDropdown.setBounds(160, 295, 150, 25);
        background.add(difficultyLabel);
        background.add(difficultyDropdown);

        //number of players input field
        JLabel playerLabel = new JLabel("Number of Players:");
        JSpinner playerSpinner = new JSpinner(new SpinnerNumberModel(4, 2, 4, 1));
        playerSpinner.setBounds(690, 295, 150, 25);
        playerLabel.setBounds(691, 270, 148, 25);
        //playerLabel.setOpaque(true);
        playerLabel.setBackground(new Color(191, 105, 86));
        playerLabel.setFont(PNBold);
        playerLabel.setForeground(new Color(255, 255, 255));
        background.add(playerLabel);
        background.add(playerSpinner);

        //How to Play button
        JButton help = new JButton("How to Play");
        help.setBounds(423, 375, 150, 45);
        help.setFont(PNBold);
        background.add(help);

        //Play button
        JButton play = new JButton("Play");
        play.setBounds(423, 425, 150, 45);
        play.setFont(PNBold);
        background.add(play);

        pack();
        setVisible(true);

        help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.toggleHelpPanel();
            }
        });

        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int difficulty = difficultyDropdown.getSelectedIndex();
                int numPlayers = (int) playerSpinner.getValue();
                System.out.println("Number of Players: " + numPlayers + "\nDifficulty: " + difficulty);
                while (true) {
                    try {
                        if (difficulty == 0) throw new NumberFormatException();
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(MenuPanel.super.getContentPane(), "You did not select a difficulty! \nPlease go back and select one!", "Missing Arguments!", JOptionPane.ERROR_MESSAGE);
                        throw ex;
                    }
                    break;
                }
                parentPanel.hideMenuPanel();
                GameState gameState = new GameState(difficulty, numPlayers);
            }
        });
    }
}
