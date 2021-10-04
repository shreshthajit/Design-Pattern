package Strategy_Pattern;

public class Birds extends Animal{
   public Birds(){
        super();
        setSound("sweet");
        flyType=new ItFlys();

    }
}
