package game.simulation.player;

import game.panel.GameBoard;

import java.util.ArrayList;
import java.util.TreeMap;

public class Engineer {
    private ArrayList<ArrayList<Integer>>  moveableTiles;

    public Engineer(){
        moveableTiles = new ArrayList<>();
    }

    public ArrayList<ArrayList<Integer>> getMoveableTiles(int[] pos){
        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
        ArrayList <Integer> newPos = new ArrayList<Integer>;
        newPos.add(pos[0]);
        newPos.add(pos[1]+1);
        temp.add(newPos);
        //newPos.removeAll();
        newPos.add(pos[0] + 1);
        newPos.add(pos[1]);
        temp.add(newPos);
      //  newPos.removeAll();
        newPos.add(pos[0]);
        newPos.add(pos[1]-1);
        temp.add(newPos);
    //    newPos.removeAll();
        newPos.add(pos[0] -1);
        newPos.add(pos[1]);
        temp.add(newPos);

        return moveableTiles;
    }
}
