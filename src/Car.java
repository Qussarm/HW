public class Car  implements Comparable<Car> {
    private String model;
    private int year;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public double getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    private String color;

    @Override

    public int compareTo(Car car) {

        if (this.year < car.getYear()) {

            return -1;

        } else if (this.year > car.getYear()) {

            return 1;

        } else {

            return 0;

        }

    }

}