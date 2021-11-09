package game;

import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;
import game.panel.ParentPanel;

import java.io.IOException;

public class GameRunner {

    public static void main(String[] args) throws IOException {
        FlatNordIJTheme.setup();

        ParentPanel bingoGame = new ParentPanel();

    }
}
