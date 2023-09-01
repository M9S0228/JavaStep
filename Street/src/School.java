public class School extends Building{
    private int countStudent;
    private  SchoolAccreditation accreditation;

    public School() {
    }

    public School(String address, int countStudent, SchoolAccreditation accreditation) {
        super(address);
        this.countStudent = countStudent;
        this.accreditation = accreditation;
    }

    @Override
    public void printInfo() {
        System.out.println("\n\t\tШкола");
        System.out.println("Адреса: " + address);
        System.out.println("Кількість студентів: " + countStudent);
        System.out.println("Рівень акредитації: " + accreditation);
    }
}
