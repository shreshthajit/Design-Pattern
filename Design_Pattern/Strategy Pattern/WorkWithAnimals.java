package Strategy_Pattern;

public class WorkWithAnimals {
    public static void main(String[] args)
    {
        Dog dog=new Dog();
        dog.setName("fido");
        System.out.println(dog.getName());
        dog.digHole();
        dog.setWeight(-1);
        int randNum=10;
        dog.changeVariable(randNum);
        System.out.println("Random number after method call = "+randNum);
        changeObjectName(dog);
        System.out.println("After changin the objectname "+dog.getName());

        Animal doggy=new Dog();
       /// Animal kitty=new Cat();
       // System.out.println("Doggy says "+doggy.getSound());
       // System.out.println("Kitty says "+kitty.getSound());


        //Animal[] animals=new Animal[4];
        //animals[0]=new Dog();
        //animals[1]=new Cat();
        //System.out.println("Doggy says "+animals[0].getSound());
        //System.out.println("Kitty says "+animals[1].getSound());

        SpeakAnimal(doggy);

        dog.accessPrivate();

        Giraffe giraffe=new Giraffe();
        giraffe.setName("Frank");
        System.out.println(giraffe.getName());












    }
    public static void changeObjectName(Dog dog){

        dog.setName("Marcus");
    }

    public static void SpeakAnimal(Animal randAnimal){
        System.out.println("Animal says "+randAnimal.getSound());
    }
}
