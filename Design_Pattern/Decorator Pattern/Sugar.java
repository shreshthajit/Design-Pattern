package Decorator_Pattern;

class Sugar extends BeverageDecorator{
    public Sugar(Beverage beverage){
        super(beverage);
    }
    public void decoratePattern(){
        super.decoratePattern();
        decorateSugar();
    }
    public void decorateSugar(){
        System.out.println("Added Sugar to : "+beverage.getName());
    }
    public int getIncrementPrice(){
        return 15;
    }
    public String getDecoratedName(){
        return "Sugar";
    }
}