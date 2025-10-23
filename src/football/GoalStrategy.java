package football;
public class GoalStrategy implements PlayerAction {
    @Override
    public void performAction() {
        System.out.println("player scores a goal");
    }
}
