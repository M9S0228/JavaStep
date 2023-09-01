public abstract class Building implements Address{
    public String address;

    public Building() {
    }

    public Building(String address) {
        this.address = address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public abstract void printInfo();
}
