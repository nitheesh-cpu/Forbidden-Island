package game.simulation.board;

import game.simulation.player.Player;

public class TreasurePiece {
    private String color;
    private boolean isCaptured;
    private Player capturedBy;

    public TreasurePiece(String color) {
        this.color = color;
        isCaptured = false;
    }

    public void setCaptured(Player captured) {
        isCaptured = true;
        capturedBy = captured;
    }

    public String getColor() {
        return color;
    }

    public boolean isCaptured() {
        return isCaptured;
    }

    public Player getCapturedBy() {
        return capturedBy;
    }
}
