package Observer_Pattern;

import java.text.DecimalFormat;

public class GetStock implements Runnable{

    private int startTime;
    private String stock;
    private double price;

    private Subject stockgrabber;

    public GetStock(Subject stockGrabber,int StartTime,String newStock,double Price){
        this.stockgrabber=stockGrabber;
        startTime=StartTime;
        stock=newStock;
        price=Price;
    }

    @Override
    public void run() {
        for(int i=0;i<=20;i++){
            try {
                Thread.sleep(1000);

            }catch (InterruptedException e){
            }

            double randNum=(Math.random() * (0.06)) - 0.03;
            DecimalFormat df=new DecimalFormat("#.##");
            price=Double.valueOf(df.format((price+randNum)));

            if(stock == "IBM") ((StockGrabber)stockgrabber).setIbmPrice(price);
            if(stock == "APPLE")((StockGrabber)stockgrabber).setApplePrice((price));
            if(stock == "GOOGLE")((StockGrabber)stockgrabber).setGooglePrice(price);

            System.out.println("stock:"+df.format((price+randNum))+" "+df.format(randNum));
            System.out.println();

        }
    }
}
