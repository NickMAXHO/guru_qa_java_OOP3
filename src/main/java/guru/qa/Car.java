package guru.qa;

import java.util.LinkedList;

public class Car {
    private String brand;
    private String model;
    private int carYear;
    private int horsePower;
    boolean nRingRace;
    double nRingTime;
    private Car[] otherCityCars;
    private LinkedList<Car> carsList;

    public Car(String brand, String model, int carYear, int horsePower, boolean nRingRace, double nRingTime){
        this.brand = brand;
        this.model = model;
        this.carYear = carYear;
        this.horsePower = horsePower;
        this.nRingRace = nRingRace;
        this.nRingTime = nRingTime;
    }

    public void addCar(Car[] otherCityCars){
        this.otherCityCars = otherCityCars;
    }

    public void printOtherCityCars(){
        for (int i = 0; i < otherCityCars.length; i++) {
            System.out.println(otherCityCars[i]);
        }
    }

    public void printCarByBrandIfPresent(String brand) {
        for (int i = 0; i < otherCityCars.length; i++) {
            Car otherCityCar = otherCityCars[i];
            if (otherCityCar.brand.equals(brand)) {
                System.out.println(otherCityCar);
                return;
            }
        }
        System.out.println("Not found");
    }

    public Car() {
        this.carsList = new LinkedList<Car>();
    }

    public void addCarToQueue(Car value) {
        this.carsList.add(value);
    }

    public void removeCar(Car value) {
        this.carsList.remove(value);
    }

    public void findCar(Car value) {
        boolean found = false;
        while (!found && !this.carsList.isEmpty()) {
            if (this.carsList.peek().equals(value)) {
                System.out.println("Search for Car in the collection:" + " " + value + " " +  "Found");
                found = true;
            } else {
                this.carsList.pop();
            }
        }
        if (!found) {
            System.out.println("Search for Car in the collection:" + " " + value + " " +  "Not found");
        }
    }

    public void printCars() {
        for (Car i : this.carsList) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + "," + " year of release: " + carYear
                + "," + " horsepower: " + horsePower + " hp, " + "raced on Nurburgring: " + nRingRace + " NurburgRingTime: " + nRingTime;
    }
}
