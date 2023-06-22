package guru.qa;

public class Main {
            public static void main (String[]args){

            Car velosterN = new Car("Hyundai", "Veloster N", 2019, 275,
                    true, 10.01);
            System.out.println(velosterN);

            Car bmwZ3M = new Car("BMW", "Z3M", 2004, 321,
                    true, 8.34);
            System.out.println(bmwZ3M);

            Car arqv = new Car("Alfa Romeo", "Giulia Quadrifoglio", 2016, 510,
                    true, 7.32);
            System.out.println(arqv);

            Car rs6 = new Car("Audi", "RS6", 2008, 570,
                    true, 8.09);
            System.out.println(rs6);

            Car[] otherCityCars = new Car[]{bmwZ3M, arqv};
            velosterN.addCar(otherCityCars);
            velosterN.printOtherCityCars();
            velosterN.printCarByBrandIfPresent("Seat");
            velosterN.printCarByBrandIfPresent("Audi");

            Car car = new Car();
            car.addCarToQueue(velosterN);
            car.addCarToQueue(bmwZ3M);
            car.addCarToQueue(arqv);
            car.addCarToQueue(rs6);
            car.printCars();
            car.findCar(rs6);
            car.removeCar(bmwZ3M);
            car.printCars();


            Cat piu = new Cat("Piu", 9, "black", "siberian", false);
            System.out.println(piu);

            Cat lambert = new Cat("Lambert", 5, "black-white", "japanese", false);
            System.out.println(lambert);

            Cat kuzya = new Cat("Kuzya", 5, "Black", "siberian", true);
            System.out.println(kuzya);

            Cat martin = new Cat("Martin", 6, "tiger", "russian", false);
            System.out.println(martin);

            Cat[] neighbours = new Cat[]{piu, martin, kuzya};
            lambert.addNeighbour(neighbours);
            lambert.printNeighbours();
            lambert.printCatByNameIfPresent("Martin");
            lambert.printCatByNameIfPresent("Scotch");

            Cat cats = new Cat();
            cats.addCatToSet(lambert);
            cats.addCatToSet(piu);
            cats.addCatToSet(martin);
            cats.addCatToSet(kuzya);
            cats.printCats();
            cats.removeCat(kuzya);
            cats.printCats();
            System.out.println("Find: Martin" + " " + cats.findCat(martin));


                Country russia = new Country("Russia","Moscow",143,
                        "different", true);
                System.out.println(russia);

                Country southKorea = new Country("South Korea", "Seoul", 52,
                        "Musson", true);
                System.out.println(southKorea);

                Country kazakhstan = new Country("Kazakhstan", "Astana", 20,
                        "different", true);
                System.out.println(kazakhstan);

                Country canada = new Country("Canada", "Ottawa", 40,
                        "different", false);
                System.out.println(canada);

                Country[] previousCountries = new Country[] {kazakhstan, southKorea, canada};
                russia.addCountry(previousCountries);
                russia.printCountries();
                russia.printCountryIfPresent("South Korea");
                russia.printCountryIfPresent("Tunis");

                Country countries = new Country();
                countries.addCountryToList(russia);
                countries.addCountryToList(southKorea);
                countries.addCountryToList(canada);
                countries.addCountryToList(kazakhstan);
                countries.printCountries();
                countries.removeCountry(southKorea);
                countries.printCountries();
                System.out.println("Find: Canada" + " " + countries.findCountry(canada));


                Bike cb400 = new Bike("Honda", "CB400", 1992,
                        400, "street" ,false);
                System.out.println(cb400);

                Bike bandit = new Bike("Suzuki", "Bandit", 1996,
                        400, "street", true);
                System.out.println(bandit);

                Bike vmax = new Bike("Yamaha", "V-Max 1200", 1988,
                        1200, "cruiser", false);
                System.out.println(vmax);

                Bike dragStar = new Bike("Yamaha", "DragStar Custom", 1995, 650,
                        "chopper", true);
                System.out.println(dragStar);

                Bike[] noviceBikes = new Bike[] {dragStar, cb400, vmax};
                bandit.addBike(noviceBikes);
                bandit.printNoviceBikes();
                bandit.printNoviceBikesByMakerIfPresent("Honda");
                bandit.printNoviceBikesByMakerIfPresent("Triumph");

                Bike goodNoviceBikes = new Bike();
                goodNoviceBikes.addBikeToSet(cb400);
                goodNoviceBikes.addBikeToSet(vmax);
                goodNoviceBikes.addBikeToSet(bandit);
                goodNoviceBikes.addBikeToSet(dragStar);
                goodNoviceBikes.printAllTheBikes();
                goodNoviceBikes.removeBike(vmax);
                goodNoviceBikes.printAllTheBikes();
                System.out.println("Search for the best bike for novice" + " " + goodNoviceBikes.findBike(cb400));

        }
    }