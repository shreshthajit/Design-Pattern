package Strategy_Pattern;

public class Animal {
    private String name;
    private int weight;
    private String sound;
    public Flys flyType;

    public void setName(String newName){
        name=newName;
    }
    public String getName(){
        return name;
    }
    public void setWeight(int Newweight){
        if(Newweight>0){
            weight=Newweight;
        }
        else{
            System.out.println("Weight must be greater than zero");
        }
    }
    public int getWeight(){
        return weight;
    }

    public void setSound(String setsound){
        sound=setsound;
    }
    public String getSound(){
        return sound;
    }

    public String tryToFly(){
        return flyType.flys();
    }

    public void setFlyingAbility(Flys newFlytype){
        flyType=newFlytype;
    }








}
