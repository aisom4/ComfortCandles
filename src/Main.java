import java.util.ArrayList;
 class Candle {
    private String candleName;
    private int candleQuantity;
    private int candleBurnTime;

    private double candleDollarPerBurnTime;

    private double candlePrice;

 Candle(String candleName, int candleQuantity, int candleBurnTime, double candlePrice){
        this.candleName = candleName;
        this.candleQuantity = candleQuantity;
        this.candleBurnTime = candleBurnTime;
        this.candlePrice = candlePrice;
        this.candleDollarPerBurnTime = candlePrice / candleBurnTime;

    }

//GETTER METHODS
     public String getCandleName(){
     return candleName;
     }

     public int getCandleQuantity(){
     return candleQuantity;
     }

     public int getCandleBurnTime(){
     return candleBurnTime;
     }

     public double getCandleDollarPerBurnTime(){
     return candleDollarPerBurnTime;
     }

     public double getCandlePrice(){
     return candlePrice;
     }

     public double getTotal(){
     return candleQuantity * candlePrice;
     }

}

//Creating the candle array



public class Main {
    public static void main(String[] args) {
        //Main Class Here
        ArrayList<Candle> candles = new ArrayList<>();
        candles.add(new Candle("Frozen Lake", 10, 20, 40.00));
        candles.add(new Candle("Wild Sands", 3, 15, 30.00));
        candles.add(new Candle("White Gardenia", 2, 30, 60.00));
        //RECEIPT PRINTING

        System.out.println("RECEIPT");
        for (Candle candle : candles) {
            System.out.println("Candle Name: " + candle.getCandleName());
            System.out.println("Quantity: " + candle.getCandleQuantity());
            System.out.println("Burn Time: " + candle.getCandleBurnTime() + " hours");
            System.out.println("Dollar Per Burn Time: " + candle.getCandleDollarPerBurnTime());
            System.out.println("Total: " + candle.getTotal());
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        }

        //Calculations

        int totalQuantity = 0;
        int totalBurnTime = 0;
        double totalDollarPerBurnTime = 0;
        double totalPrice = 0;

        for (Candle candle : candles) {

            totalQuantity += candle.getCandleQuantity();
            totalBurnTime += candle.getCandleBurnTime();
            totalDollarPerBurnTime += candle.getCandleDollarPerBurnTime() * candle.getCandleQuantity();
            totalPrice += candle.getTotal();
        }


        System.out.println("Total Quantity: " + totalQuantity);
        System.out.println("Total Burn Time: " + totalBurnTime + " hours");
        System.out.println("Total Dollar Per Burn Time: $" + totalDollarPerBurnTime);
        System.out.println("Total Price: $" + totalPrice);

    }
}
