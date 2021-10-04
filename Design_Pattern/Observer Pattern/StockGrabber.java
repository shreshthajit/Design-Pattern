package Observer_Pattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {
    ///we have implemented method by just clicking the redunderline perviously

    private ArrayList<Observer>observers;
    private double applePrice;
    private double ibmPrice;
    private double googlePrice;



    public StockGrabber(){
        observers=new ArrayList<Observer>();
    }


    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void Unregister(Observer deleteObserver) {
       int observerIndex= observers.indexOf(deleteObserver);
        System.out.println("observer "+(observerIndex+1)+" deleted");
        observers.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(ibmPrice,applePrice,googlePrice);
        }
    }

    public void setIbmPrice(double newIbmPrice){
        this.ibmPrice=newIbmPrice;
        notifyObserver();
    }

    public void setApplePrice(double newApplePrice){
        this.applePrice=newApplePrice;
        notifyObserver();
    }
    public  void setGooglePrice(double newGooglePrice){
        this.googlePrice=newGooglePrice;
        notifyObserver();
    }

}
