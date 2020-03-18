public class Main {
    public static void main(String[] args) {

    }
}
class Airplane {
    private String brand;
    private int numberOfSeats;
    private Engine engine;

    public Airplane(String brand, int numberOfSeats, Engine engine) {
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;
        this.engine = engine;
    }

    void isEngineEcological() {
        if (engine.getHorsePower() < 2000 && engine.getProductionYear() > 2000) {
        System.out.println("engine is ecological");
    } else System.out.println("Engine is not ecological");
}
public String getBrand() {
        return brand;
}
public void setBrand(String brand) {
        this.brand = brand;

}
public Engine setEngine() {
        return engine;
}
public int getNumberOfSeats(

) {
        return numberOfSeats;
}
public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
}

}
class Engine {
    private double HorsePower;
    private int ProductionYear;

    public Engine(double HorsePower, int ProductionYear) {
        this.HorsePower = HorsePower;
        this.ProductionYear = ProductionYear;
    }

    public int getProductionYear() {
        return ProductionYear;
    }

    public void setProductionYear(int productionYear) {
        ProductionYear = productionYear;
    }

    public double getHorsePower() {
        return HorsePower;

    }

    public void setHorsePower(double horsePower) {
        HorsePower = horsePower;
    }
}

