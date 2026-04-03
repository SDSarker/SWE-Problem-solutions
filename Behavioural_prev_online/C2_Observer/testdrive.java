public class testdrive {
    public static void main(String[] args) {
        Widget w1=new TicketTapeWidg();
        Widget w2=new GraphWidg();
        Widget w3=new BuySellwidg();
        
        StockData stockData=new StockData();
        stockData.addWidget(w1);
        stockData.addWidget(w2);
        stockData.addWidget(w3);

        stockData.setPrice(300);

        stockData.removeWidget(w2);

        stockData.setPrice(500);
    }    
}
