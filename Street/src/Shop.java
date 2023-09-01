public class Shop extends Building{
    private ShopType shopType;

    public Shop() {
    }

    public Shop(String address, ShopType shopType) {
        super(address);
        this.shopType = shopType;
    }

    @Override
    public void printInfo() {
        System.out.println("\n\t\tМагазин");
        System.out.println("Адреса: " + address);
        System.out.println("Тип магазину: " + shopType);
    }
}
