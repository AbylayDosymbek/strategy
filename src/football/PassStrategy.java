package football;
public class PassStrategy implements PlayerAction {
    @Override
    public void performAction() {
        System.out.println("player passes the ball");
    }
}
