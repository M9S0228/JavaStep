public class ResidentialBuilding extends Building{
    private int countResident;

    public ResidentialBuilding() {

    }
    public ResidentialBuilding(String address, int countResident) {
        super(address);
        this.countResident = countResident;
    }

    @Override
    public void printInfo() {
        System.out.println("\n\t  Житловий будинок");
        System.out.println("Адреса: " + address);
        System.out.println("Кількість жильців: " + countResident);
    }
}
