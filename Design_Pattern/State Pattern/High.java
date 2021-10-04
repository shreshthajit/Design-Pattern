package State_Pattern;

public class High implements State{
    public void Action(Context wrapper) {
        wrapper.set_state(new Off());
        System.out.println("turning off");
    }
}
