public class Cargo {
    private String appointment;
    private int quantity;
    private String type;

    public Cargo(String appointment, int quantity, String type) {
        this.appointment = appointment;
        this.quantity = quantity;
        this.type = type;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
