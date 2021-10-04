package Decorator_Pattern;

class Coffee2 extends Beverage{
    public Coffee2(String name){
        super(name);
        setPrice(120);
    }
    public void decoratePattern(){
        System.out.println("Cost of : "+ name +" : "+ price);
    }
}