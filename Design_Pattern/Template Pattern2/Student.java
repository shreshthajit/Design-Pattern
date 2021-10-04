package Template_Pattern2;

public class Student extends Simulation_Game{

    @Override
    void start() {
        System.out.println("Student starts the game.");
    }

    @Override
    void playing() {
        System.out.println("Student is playing the game.");
    }

    @Override
    void end() {
        System.out.println("Student's game end.");
    }
}
