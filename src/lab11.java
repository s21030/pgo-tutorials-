import java.util.ArrayList;
        import java.util.Collection;
        import java.util.Collections;

        public class lab11 {
    public void main(String[] args) {

        ArrayList<Car> cars = new ArrayList();

        Car c1 = new Car("Honda Civic", 1980);
        Car c2 = new Car("Opel Astra", 1985);
        Car c3 = new Car("Ford Focus", 2015);
        Car c4 = new Car("Hundai i20", 2017);
        Car c5 = new Car("Ferrari", 2011);
        Car c6 = new Car("Chevrolet", 2003);
        Car c7 = new Car("Mustang", 2009);
        Car c8 = new Car("Jeep", 2020);
        Car c9 = new Car("BigTruck", 20008);
        Car c10 = new Car("Opel", 2020);

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);

        Collections.sort(cars);

        for (Car c : cars) {
            System.out.println(c);
        }
    }
    public class Car
            implements Comparable<Car> {

        private String name;
        private int productionYear;

        public Car(String name, int productionYear) {
            this.name = name;
            this.productionYear = productionYear;
        }
        @Override
        public int compareTo(Car c) {
            return this.productionYear - c.productionYear;
        }
        public String toString() {
            return name;
        }
    }
}