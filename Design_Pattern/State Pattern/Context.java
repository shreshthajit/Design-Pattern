package State_Pattern;

public class Context {
    private State currentState;

    public Context() {
        currentState = new Off();
    }

    public void set_state(State s) {
        currentState = s;
    }


   public void Action() {
       currentState.Action(this);
   }
}
