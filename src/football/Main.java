//a
package football;
public class Main {
    public static void main(String[] args) {
        Player player = new Player(new GoalStrategy());
        player.executeAction();
        player.setPlayerAction(new PassStrategy());
        player.executeAction();
        player.setPlayerAction(new DribbleStrategy());
        player.executeAction();
    }
}
