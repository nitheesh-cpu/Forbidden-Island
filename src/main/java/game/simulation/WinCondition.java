package game.simulation;

import game.panel.DefeatPanel;
import game.panel.MenuPanel;
import game.panel.VictoryPanel;

public class WinCondition
{
    public boolean checkWinCondition()
    {
        return false;
    }

    public void displayVictory()
    {
        if(checkWinCondition())
        {
            VictoryPanel p = new VictoryPanel();
        }
    }

    public void displayLose()
    {
        if(!checkWinCondition())
        {
            DefeatPanel d = new DefeatPanel();
        }
    }
}
