package Strategy_Pattern;

public interface Living {

    //we don't need to write abstract before void because by default it is written
    public void setName(String newName);
    public String getName();

    public void setHeight(double newHeight);
    public double getHeight();




}
