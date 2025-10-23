package football;
public class DribbleStrategy implements PlayerAction {
    @Override
    public void performAction() {
        System.out.println("player dribbles past opponent");
    }
}
