package State_Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StatePatternDemo {

        public static void main(String[] args) {
            Context context = new Context();///we have declared a context object here
            On on=new On();
            Off off=new Off();
            Cook cook=new Cook();
            Walk walk=new Walk();
            Scanner sc= new Scanner(System.in);
            on.Action(context);
            while (true) {
                System.out.println("Enter a command");

                String s=sc.nextLine();
                if(s.equalsIgnoreCase("off")) {
                    getLine();
                    off.Action(context);
                }
                else if(s.equalsIgnoreCase("On")){
                    getLine();
                    on.Action(context);
                    while (true){
                        Scanner scr= new Scanner(System.in);
                        String str=scr.nextLine();
                        if(str.equalsIgnoreCase("Walk")){
                            getLine();
                            walk.Action(context);
                        }
                        else if(str.equalsIgnoreCase("Cook")){
                            getLine();
                            cook.Action(context);
                        }
                        else{
                            break;
                        }
                    }
                }
               // context.Action();
            }
        }

        static String getLine() {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            try {
                line = in.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return line;
        }
}
