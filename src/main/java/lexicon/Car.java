package lexicon;

import java.util.HashMap;

public class Car {
    // ******
    // Fields
    // ******

    private int id;
    private String brand;
    private String model;
    private static int sequencer;

    // **************
    // Constructor(s)
    // **************

    public Car(String brand, String model) {
        setId(sequencer());
        setBrand(brand);
        setModel(model);
    }

    // *******
    // Methods
    // *******
    public void createCar(Car car) {
        HashMap<Integer, Car> carHashMap = new HashMap<>();
        carHashMap.put(car.getId(), car);
        Car carFromHashMap = (carHashMap.get(car.getId()));
        System.out.println(carFromHashMap.getBrand());
    }

    public int sequencer() {
        return ++sequencer;
    }

    // *****************
    // Getters & Setters
    // *****************

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
