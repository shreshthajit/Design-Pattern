package State_Pattern;

public class Cook implements State{
    public void Action(Context context) {
        context.set_state(new Walk());
        System.out.println("Cooking");
    }
}
