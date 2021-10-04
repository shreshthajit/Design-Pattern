package Template_Pattern2;

public class Worker extends Simulation_Game {
    @Override
    void start() {
        System.out.println("Worker starts the game.");
    }

    @Override
    void playing() {
        System.out.println("Worker is playing the game.");
    }

    @Override
    void end() {
        System.out.println("Worker's game end.");
    }
}
