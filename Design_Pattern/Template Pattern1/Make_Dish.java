package Template_Pattern1;

public class Make_Dish {
    public static void main(String[] args){

        Spaghetti spaghetti = new Spaghetti();

        System.out.println("Let's make Spaghetti");
        spaghetti.makeDish();
        System.out.println();

        penne_noodles penne_noodles = new penne_noodles();
        System.out.println("Let's make Penne_noddles");
        penne_noodles.makeDish();
    }
}
