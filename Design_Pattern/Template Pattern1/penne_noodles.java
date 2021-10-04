package Template_Pattern1;

public class penne_noodles extends Dish{
    String[] meatUsed = { "Chicken" };
    String[] sauceUsed = { "Alfredo Sauce" };


    public void addMeat(){
        System.out.print("Adding the Meat: ");
        for (String meat : meatUsed){
            System.out.print(meat + " ");
        }
    }

    public void addSauce(){
        System.out.print("Adding the Sauce: ");
        for (String sauce : sauceUsed){
            System.out.print(sauce + " ");
        }
        System.out.println();
        System.out.println("Garnish the plate");
    }


}
