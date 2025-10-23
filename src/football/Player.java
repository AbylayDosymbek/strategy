package football;
public class Player {
    private PlayerAction playerAction;
    public Player(PlayerAction playerAction) {
        this.playerAction = playerAction;
    }
    public void setPlayerAction(PlayerAction playerAction) {
        this.playerAction = playerAction;
    }
    public void executeAction() {
        playerAction.performAction();
    }
}
