package game.panel;

import java.io.IOException;

public class ParentPanel {
    private MenuPanel menuPanel = null;
    private HelpPanel helpPanel = null;
    private SettingsPanel settingsPanel = null;

    public ParentPanel() {
        menuPanel = new MenuPanel(this);
    }

    public void toggleHelpPanel() {
        if (helpPanel == null) {
            try {
                helpPanel = new HelpPanel();
            } catch (IOException exc) {
                exc.printStackTrace();
            }
        } else if (!helpPanel.isVisible()) {
            helpPanel.setVisible(true);
        } else {
            helpPanel.setVisible(false);
        }
    }

    public void hideMenuPanel() {
        menuPanel.dispose();
    }
}
