package game.simulation;

import game.panel.DefeatPanel;
import game.panel.MenuPanel;
import game.panel.VictoryPanel;
import game.simulation.player.Player;

public class WinCondition
{
    public boolean checkWinCondition()
    {
        return true;
    }

    public void displayVictory()
    {
        if(checkWinCondition() == true)
        {
            VictoryPanel p = new VictoryPanel("Congratulations :)");
        }
    }

    public void displayLose()
    {
        if(checkWinCondition() == false)
        {
            DefeatPanel d = new DefeatPanel("That's disappointing :(");
        }
    }
}
