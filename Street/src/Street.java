public class Street {
    private String streetName;
    private Building[] buildings;

    public Street() {
    }

    public Street(String streetName, Building[] buildings) {
        this.streetName = streetName;
        this.buildings = buildings;
    }
    public void printInfo(){
        System.out.println("\n\tВулиця:" + streetName);
        for(Building building : buildings){
            building.printInfo();
        }
    }
}
