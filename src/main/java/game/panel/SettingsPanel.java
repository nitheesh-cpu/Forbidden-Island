package game.panel;

import javax.swing.*;

public class SettingsPanel extends JFrame {
    private JPanel settings;
    private JButton close;
    private JLabel theme;

    public SettingsPanel() {
        super("Settings");
        setSize(600, 880);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        theme = new JLabel("Theme");
    }

    public void setTheme() {

    }
}
