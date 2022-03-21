package Archive.HomeWork0203.second;

public class Player {
    private int playerMoveX;
    private int playerMoveY;

    //   private move;
    public Player(int playerMoveX, int playerMoveY) {
        this.playerMoveX = playerMoveX;
        this.playerMoveY = playerMoveY;
    }

    @Override
    public String toString() {
        return "Player: " +
                "Текущие положение Х= " + playerMoveX +
                ", Текущие положение Y= " + playerMoveY;
    }

    public int getPlayerMoveX() {
        return playerMoveX;
    }

    public void setPlayerMoveX(int playerMoveX) {
        this.playerMoveX = playerMoveX;
    }

    public int getPlayerMoveY() {
        return playerMoveY;
    }

    public void setPlayerMoveY(int playerMoveY) {
        this.playerMoveY = playerMoveY;
    }


}
