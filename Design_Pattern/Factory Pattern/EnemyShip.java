package Factory_Pattern;

public abstract class EnemyShip{
    private String name;
    private double speed;
    private double directionX;
    private double amtDamage;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name=newName;
    }

    public void setDamage(double newDamage){
        amtDamage=newDamage;
    }
    public double getDamage(){
        return amtDamage;
    }

    public void followHeroShip(){
        System.out.println(getName()+" is following the hero");
    }

    public void displayEnemyship(){
        System.out.println(getName()+"  is on the screen");
    }

    public void enemyShipShoots(){
        System.out.println(getName()+" attacks and does "+ getDamage()+"Damage to hero");
    }














}
