package Decorator_Pattern;

class Milk extends BeverageDecorator{
    public Milk(Beverage beverage){
        super(beverage);
    }
    public void decoratePattern(){
        super.decoratePattern();
        decorateLemon();
    }
    public void decorateLemon(){
        System.out.println("Added Milk to : "+beverage.getName());
    }
    public int getIncrementPrice(){
        return 20;
    }
    public String getDecoratedName(){
        return "Milk";
    }
}