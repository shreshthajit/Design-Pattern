package Decorator_Pattern;

class Coffee3 extends Beverage{
    public Coffee3(String name){
        super(name);
        setPrice(150);
    }
    public void decoratePattern(){
        System.out.println("Cost of : "+ name +" : "+ price);
    }
}