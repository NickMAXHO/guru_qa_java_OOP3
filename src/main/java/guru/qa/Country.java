package guru.qa;

import java.util.ArrayList;

public class Country {

    public String country;
    public String capital;
    private int population;
    private String climate;
    private boolean isVisited;
    private Country[] previousCountries;
    private ArrayList<Country> countryArrayList;


    public Country(String country, String capital, int population, String climate, boolean isVisited) {
        this.country = country;
        this.capital = capital;
        this.population = population;
        this.climate = climate;
        this.isVisited = isVisited;
    }

    public void addCountry(Country[] previousCountries){
        this.previousCountries = previousCountries;
    }

    public void printCountryIfPresent(String title) {
        for (Country previousCountry : previousCountries) {
            if (previousCountry.country.equals(title)) {
                System.out.println(previousCountry);
                return;
            }
        }
        System.out.println("Not found");
    }
    public Country() {
        this.countryArrayList = new ArrayList<Country>();
    }

    public void addCountryToList(Country value) {
        this.countryArrayList.add(value);
    }

    public void removeCountry(Country value) {
        this.countryArrayList.remove(value);
    }

    public boolean findCountry(Country value) {
        for (Country i : this.countryArrayList) {
            if (i.equals(value))
                return true;
        }
        return false;
    }

    public void printCountries() {
        for (Country i : this.countryArrayList) {
            System.out.println(i);
        }
    }


    @Override
    public String toString() {
        return country + "'s capital is " + capital + " , and it's population is: " + population
                + " millions and it's climate is: " + climate + " and it's " + isVisited + " that i visited it.";
    }

}
