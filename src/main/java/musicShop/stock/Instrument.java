package musicShop.stock;

public abstract class Instrument implements IPlay, ISell{
    private String colour, brand, type;
    private int buyingPrice, sellingPrice;

    public Instrument(String type, String colour, String brand, int buyingPrice, int sellingPrice){
        this.type = type;
        this.colour = colour;
        this.brand = brand;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return this.type;
    }

    public String getColour() {
        return this.colour;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getBuyingPrice() {
        return this.buyingPrice;
    }

    public int getSellingPrice() {
        return this.sellingPrice;
    }

    @Override
    public String play() {
        return "You are playing the " + this.getType();
    }

    @Override
    public int calculateMarkup() {
        return (this.sellingPrice - this.buyingPrice);
    }
}
