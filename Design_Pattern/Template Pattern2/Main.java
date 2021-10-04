package Template_Pattern2;

public class Main {
    public static void main(String[] args) {

        Simulation_Game student = new Student();
        student.play();

        System.out.println("");

        Simulation_Game teacher = new Teacher();
        teacher.play();

        System.out.println("");

        Simulation_Game worker = new Worker();
        worker.play();
    }
}
