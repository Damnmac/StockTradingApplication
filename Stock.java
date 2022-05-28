public class Stock
{
    String symbol;
    int price;

    public Stock(){}

    public Stock(String symbol, int boughtPrice)
    {
        this.symbol = symbol;
        this.price = boughtPrice;
    }
    public String getSymbol()
    {
        return this.symbol;
    }

    public int getPrice() {
        return price;
    }
}
