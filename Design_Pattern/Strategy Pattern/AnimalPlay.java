package Strategy_Pattern;

public class AnimalPlay {
    public static void main(String[] args) {
        Animal sparky=new Dog();
        Animal tweet=new Birds();

        System.out.println("Dog: "+sparky.tryToFly());
        System.out.println("Birds: "+tweet.tryToFly());

        sparky.setFlyingAbility(new ItFlys());
        System.out.println("Dog: "+sparky.tryToFly());
    }
}
