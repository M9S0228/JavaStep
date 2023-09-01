
public class Main {
    public static void main(String[] args) {
       Building[] building = {
               new School("вул.Проскурівська 17", 999, SchoolAccreditation.GYMNASIUM),
               new ResidentialBuilding("вул. Проскурівська 44/1", 165),
               new Hospital("вул.Проскурівська 666",666),
               new Shop("вул.Проскурівська 32/3", ShopType.MARKET),
               new Shop("вул.Проскурівська 63", ShopType.BAKERY),
               new Shop("вул.Проскурівська 98", ShopType.BUTCHER),
               new Shop("вул.Проскурівська 115", ShopType.BOOKSHOP),
               new Shop("вул.Проскурівська 1", ShopType.CANDY),
               new School("вул.Проскурівська 212", 300, SchoolAccreditation.LYCEUM),
               new ResidentialBuilding("вул.Проскурівська 44/2", 200),
               new ResidentialBuilding("вул.Проскурівська 100", 500),
       };
       Street street = new Street("Проскурівська", building);
       street.printInfo();

       ResidentialBuilding building1 = new ResidentialBuilding("вул. Проскурівська 44/1", 50);
       building1.setAddress("вул. Проскурівська 2");
       building1.printInfo();
    }
}
