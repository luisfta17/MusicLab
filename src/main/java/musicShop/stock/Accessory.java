package musicShop.stock;

public abstract class Accessory implements ISell {
    private String type;
    private int buyingPrice, sellingPrice;

    public Accessory(String type, int buyingPrice, int sellingPrice){
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return this.type;
    }

    public int getBuyingPrice() {
        return this.buyingPrice;
    }

    @Override
    public int getSellingPrice() {
        return this.sellingPrice;
    }
    @Override
    public int calculateMarkup() {
        return (this.sellingPrice - this.buyingPrice);
    }
}
