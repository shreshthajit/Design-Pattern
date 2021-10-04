package Strategy_Pattern;

public class Monkey implements Living{
    private String name;
    private double height;
    @Override
    public void setName(String newName) {
        name=newName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public  void setHeight(double newHeight) {
        height=newHeight;

    }

    @Override
    public double getHeight() {
        return height;
    }
}
