package guru.qa;

import java.util.HashSet;
import java.util.Set;

public class Cat {
    private String name;
    private int age;
    private String color;
    private String breed;
    private boolean isAgressive;
    private Cat[] neighbours;
    private Set<Cat> catSet;

    public Cat(String name, int age, String color, String breed, boolean isAgressive) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.isAgressive = isAgressive;

    }

    public void addNeighbour(Cat[] neighbours) {
        this.neighbours = neighbours;
    }

    public void printNeighbours() {
        for (Cat neighbour : neighbours) {
            System.out.println(neighbour);
        }
    }

    public void printCatByNameIfPresent(String name) {
        for (Cat neighbour : neighbours) {
            if (neighbour.name.equals(name)) {
                System.out.println(neighbour);
                return;
            }
        }
        System.out.println("Not found");
    }

    public Cat() {
        this.catSet = new HashSet<>();
    }

    public void addCatToSet(Cat value) {
        this.catSet.add(value);
    }

    public void removeCat(Cat value) {
        this.catSet.remove(value);
    }

    public boolean findCat(Cat value) {
        for (Cat i : this.catSet) {
            if (i.equals(value))
                return true;
        }
        return false;
    }

    public void printCats() {
        for (Cat i : this.catSet) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return name + ", " + age + " years old, " + color
                + " " + breed + ", " + "agressive: " + isAgressive + ".";
    }
}