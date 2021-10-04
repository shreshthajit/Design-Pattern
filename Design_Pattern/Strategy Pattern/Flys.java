package Strategy_Pattern;

public interface Flys{
    String flys();
}

 class ItFlys implements Flys{

     @Override
     public String flys() {
         return "Flying high";
     }
 }
 class CantFly implements Flys{

     @Override
     public String flys() {
         return "I can't fly";
     }
 }