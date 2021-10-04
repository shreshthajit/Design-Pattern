package Decorator_Pattern;

class Coffee1 extends Beverage{
    public Coffee1(String name){
        super(name);
        setPrice(100);
    }
    public void decoratePattern(){
        System.out.println("Cost of : "+ name +" : "+ price);
    }
}