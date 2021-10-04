package Factory_Pattern;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class EnemyShipTesting {
    public static void main(String[] args) {
        //create the factory object

        EnemyShipFactory shipFactory=new EnemyShipFactory();

        EnemyShip theEnemy=null;
        Scanner userIntput=new Scanner(System.in);

        System.out.println("What type of ship? (U / R  / B");

        if(userIntput.hasNextLine()){
            String typeofShip=userIntput.nextLine();
            theEnemy=shipFactory.makeEnemyShip(typeofShip);
            if(theEnemy !=null){
                doStuffEnemy(theEnemy);
            }
            else{
                System.out.println("Please enter U, R, or B next time");
            }
        }
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyship();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
