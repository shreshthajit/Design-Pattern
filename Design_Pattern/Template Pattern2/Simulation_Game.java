package Template_Pattern2;

abstract class Simulation_Game {
    abstract void start();
    abstract void playing();
    abstract void end();

    public void play(){

        start();

        playing();

        end();
    }
}
