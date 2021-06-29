package State_Pattern;

public class On implements State{
    public void Action(Context context) {
        context.set_state(new Walk());
        System.out.println("I am ready");
    }
}
