package Template_Pattern1;

public abstract class Dish {
    boolean  FirstCondiment = false;

    final void makeDish(){

        BoilWater();
        CookThePasta();


        if(Meat()){
            addMeat();
             FirstCondiment = true;
        }

        if(Sauce()){
            if(FirstCondiment) { System.out.print("\n"); }
            addSauce();
             FirstCondiment = true;
        }
        ServeDish();
    }


    abstract void addMeat();
    abstract void  addSauce();

    public void   BoilWater(){
        System.out.println("Water is boiling");
    }
    public void  CookThePasta(){
        System.out.println("Cooking the pasta");
    }

    boolean  Meat() { return true; }
    boolean  Sauce() { return true; }

    public void ServeDish(){
        System.out.println("Let's serve this");
    }

    public void FirstCondiment(){
        System.out.println("\n");
    }
}
