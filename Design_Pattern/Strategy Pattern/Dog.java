package Strategy_Pattern;

public class Dog extends Animal {
    public void digHole(){
        System.out.println("Dig a hole");
    }
    public Dog(){
        super();
        setSound("Bark");
        flyType=new CantFly();
    }

    public void changeVariable(int randNum){
        randNum=12;
        System.out.println("Rndom in method"+randNum);
    }

    private void bePrivate(){
        System.out.println("In a private method");
    }
    public void accessPrivate(){
        bePrivate();
    }


}
