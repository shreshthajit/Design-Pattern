package Observer_Pattern;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber=new StockGrabber();
        StockObserver observer1=new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(189.99);
        stockGrabber.setApplePrice(198.33);
        stockGrabber.setGooglePrice(599.33);
        System.out.println();
        System.out.println();

        StockObserver observer2=new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(189.99);
        stockGrabber.setApplePrice(198.33);
        stockGrabber.setGooglePrice(599.33);

        stockGrabber.Unregister(observer1);
        stockGrabber.setIbmPrice(189.99);
        stockGrabber.setApplePrice(198.33);
        stockGrabber.setGooglePrice(599.33);


        Runnable getIbm=new GetStock(stockGrabber,2,"IBM",198.44);
        Runnable getApple=new GetStock(stockGrabber,2,"APPLE",178.44);
        Runnable getGoogle=new GetStock(stockGrabber,2,"GOOGLE",543.44);

        new Thread(getIbm).start();
        new Thread(getApple).start();
        new Thread(getGoogle).start();





    }
}
