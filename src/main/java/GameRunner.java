import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;

import java.io.File;
import java.io.IOException;

public class GameRunner {

    public static void main(String[] args) {
        FlatNordIJTheme.install();

        MenuPanel bingoGame = new MenuPanel();
    }
}
