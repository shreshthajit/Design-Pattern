package State_Pattern;

public class Walk implements State{
    public void Action(Context wrapper) {
        wrapper.set_state(new Walk());
        System.out.println("Walking");
    }
}
