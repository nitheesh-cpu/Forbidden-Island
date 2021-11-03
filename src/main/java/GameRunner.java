import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class GameRunner {

    public static void main(String[] args) {
//        FlatDarculaLaf.setup();
//        FlatAtomOneDarkContrastIJTheme.setup();
        FlatNordIJTheme.setup();
//        FlatDarkLaf.setup();

        try {
            FileUtils.deleteDirectory(new File("BingoCards/cards"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        MenuPanel bingoGame = new MenuPanel();

    }
}
