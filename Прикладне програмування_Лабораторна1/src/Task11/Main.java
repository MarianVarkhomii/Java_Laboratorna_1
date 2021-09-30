package Task11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Driver> addDriver(final Driver driver){
        final List<Driver> driverList = new ArrayList<>();
        driverList.add (driver);
        return driverList;
    }
    private static List<Order> addOrder(final Order order){
        final List<Order> driverList = new ArrayList<> ();
        driverList.add (order);
        return driverList;
    }
    public static void main(final String[] args) {
        final Driver driver1 = new Driver (1234L,"Peter","Tomskiy",30,380633134);
        final Driver driver2 = new Driver (394L,"Jack","Greats",18,380963223);
        final Driver driver3 = new Driver (594L,"Christina","Smit",21,380732168);
        addDriver (driver1);

        final Car car1 = new Car(35L,"Toyota","Camry", addDriver (driver3) );
        final Car car2 = new Car(35L,"Volkswagen","Golf 8",  addDriver (driver2));

        final Order order1 = new Order (120L,149.99, LocalDate.of(2021,4,28),"15 km",car1);
        final Order order2 = new Order (900L,139.99, LocalDate.of(2021,6,1),"10 km",car2);
        final User user1 = new User (561L,"Max","Ivanovskiy",23,addOrder (order1));
        final User user2 = new User (591L,"Maria","Root",22,addOrder (order2));

        System.out.println ("User orders a taxi 1: " + user1);
        System.out.println ("--------------------------------------------------------------------------------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------------------------------------------------------------------------------" +
                "---------------");
        System.out.println ("User orders a taxi 2: " + user2);

    }
}