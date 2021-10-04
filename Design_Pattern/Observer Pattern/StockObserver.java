package Observer_Pattern;

public class StockObserver implements Observer{
    private double ibmPrice;
    private double applePrice;
    private  double googlePrice;

    private static int observerIDtracer=0;
    private int observerID;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber=stockGrabber;
        this.observerID=++observerIDtracer;
        System.out.println("New observerId="+this.observerID);
        stockGrabber.register(this);
    }


    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice=ibmPrice;
        this.applePrice=applePrice;
        this.googlePrice=googlePrice;
        PrintThePrices();

    }

    public void PrintThePrices(){
        System.out.println(observerID);
        System.out.println("IBM Price= "+ibmPrice);
        System.out.println("Apple Price= "+applePrice);
        System.out.println("Google Price= "+googlePrice);

    }
}
