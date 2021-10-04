package Template_Pattern2;

public class Teacher extends Simulation_Game {
    @Override
    void start() {
        System.out.println("Teacher starts the game.");
    }

    @Override
    void playing() {
        System.out.println("Teacher is playing the game.");
    }

    @Override
    void end() {
        System.out.println("Teacher's game end.");
    }
}
