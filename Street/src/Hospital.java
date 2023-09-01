public class Hospital extends Building{
    private int capacity;

    public Hospital() {
    }

    public Hospital(String address, int capacity) {
        super(address);
        this.capacity = capacity;
    }

    @Override
    public void printInfo() {
        System.out.println("\n\t\tЛікарня");
        System.out.println("Алреса: " + address);
        System.out.println("Місткість: " + capacity);
    }
}
