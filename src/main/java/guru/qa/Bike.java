package guru.qa;

import java.util.TreeSet;

public class Bike implements Comparable{
    private String maker;
    private String model;
    private int productionYear;
    private String type;
    private boolean isChopper;
    int engineVolume;
    private Bike[] noviceBikes;
    private TreeSet<Bike> noviceBikesSet;

    public Bike(String maker, String model, int productionYear, int engineVolume, String type, boolean isChopper) {
        this.maker = maker;
        this.model = model;
        this.productionYear = productionYear;
        this.isChopper = isChopper;
        this.engineVolume = engineVolume;
        this.type = type;
    }


    public void addBike(Bike[] noviceBikes) {
        this.noviceBikes = noviceBikes;
    }

    public void printNoviceBikes() {
        for (Bike noviceBike : noviceBikes) {
            System.out.println(noviceBike);
        }
    }

    public void printNoviceBikesByMakerIfPresent(String maker) {
        for (Bike noviceBike : noviceBikes) {
            if (noviceBike.maker.equals(maker)) {
                System.out.println(noviceBike);
                return;
            }
        }
        System.out.println("Not found");
    }

    public Bike() {
        this.noviceBikesSet = new TreeSet<>();
    }

    public void addBikeToSet(Bike value) {
        this.noviceBikesSet.add(value);
    }

    public void removeBike(Bike value) {
        this.noviceBikesSet.remove(value);
    }

    public boolean findBike(Bike value) {
        for (Bike i : this.noviceBikesSet) {
            if (i.equals(value))
                return true;
        }
        return false;
    }


    public void printAllTheBikes() {
        for (Bike i : this.noviceBikesSet) {
            System.out.println(i);
        }
    }

    @Override
    public int compareTo(Object o) {
        Bike casted = (Bike) o;
        return (this.maker + this.model).compareTo(casted.maker + casted.model);
    }

    @Override
    public String toString() {
        return maker + " " + model + " was produced in " + productionYear + " and it's " + type + " with " + engineVolume
                + "cubic inches engine, and it's " + isChopper + " that it's a chopper";
    }
}