package musicShop.stock;

public class DrumSticks extends Accessory {
    private String material;
    public DrumSticks(String type, int buyingPrice, int sellingPrice, String material){
    super(type, buyingPrice, sellingPrice);
    this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }
}
