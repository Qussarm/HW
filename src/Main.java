import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMWF90", 2018, "Black"));
        cars.add(new Car("Fit", 2002, "Green"));
        cars.add(new Car("LX570", 2013, "Purple"));
        cars.add(new Car("GX470", 2015, "White"));
        cars.add(new Car("LS200", 2014, "Brown"));
        cars.add(new Car("911", 2017, "Grey"));
        cars.add(new Car("Urus", 2019, "Orange"));
        cars.add(new Car("Tico", 2005, "Blue"));
        cars.add(new Car("W212", 2003, "Green"));
        cars.add(new Car("W221", 2004, "Red"));

        for (Car car: cars) {
            System.out.println(car.getModel() + " - Model " + car.getColor() +" - Color" + car.getYear() +" - year");


        }
        System.out.println("____________________________________________________________________");
        Collections.sort(cars);
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return 0;
            }
        });
        for (Car car:cars
             ) {
            System.out.println(car.getModel() + " - Model " + car.getColor() +" - Color" + car.getYear() +" - year");

        }
    }
}
