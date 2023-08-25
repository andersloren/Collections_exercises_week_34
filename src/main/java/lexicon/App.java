package lexicon;

import java.util.ArrayList;
import java.util.Collections;

public class App
{
    public static void main( String[] args ){

        CollectionsExercises exercises = new CollectionsExercises();

        //ex1
        System.out.println("\nex1");
        exercises.weekDays();
        //ex2
        System.out.println("\nex2");
        exercises.weekDaysIterate();
        //ex3
        System.out.println("\nex3");
        exercises.weekExcludeThursdayAddThursday();
        //ex4
        System.out.println("\nex4");
        exercises.threeFirstDaysOfWeek();
        //ex5
        System.out.println("\nex5");
        exercises.hashWeekDays();
        //ex6
        System.out.println("\nex6");
        exercises.convertHashSetToArrayList();
        //ex7
        System.out.println("\nex7");
        exercises.convertHashSetToArrayListAndPrint();
        //ex8
        System.out.println("\nex8");
        exercises.randomNamesSortedUsingSet();
        //ex9
        System.out.println("\nex9");
        exercises.printHashMap();
        //ex10
        System.out.println("\nex10");
        exercises.printHashMapKeys();
        //ex11
        System.out.println("\nex11");
        exercises.printHashMapValues();
        //ex12
        System.out.println("\nex12");
        Car car1 = new Car("Volvo", "XC60");
        Car car2 = new Car("Saab", "900");
        car1.createCar(car1);
        car2.createCar(car2);
        //challenge1
        System.out.println("\nchallenge1");
        CollectionsChallenges collectionsChallenges = new CollectionsChallenges();
        collectionsChallenges.compareTwoSetsOfWeekDays();
        //challenge2
        System.out.println("\nchallenge2");
        collectionsChallenges.setsOfSetKeys();
        //challenge3
        System.out.println("\nchallenge3");
        SuperHero superHero1 = new SuperHero("Batman", 50);
        SuperHero superHero2 = new SuperHero("Spider-Man", 100);
        SuperHero superHero3 = new SuperHero("Superman", 1540);
        ArrayList<SuperHero> heroesList = new ArrayList<>();
        heroesList.add(superHero1);
        heroesList.add(superHero2);
        heroesList.add(superHero3);
        Collections.sort(heroesList);
//        for (int i = 0; i < heroesList.size(); i++) {
//            System.out.println("Id: " + heroesList.get(i).getId() + ", Name: " + heroesList.get(i).getName() + ", Age: " + heroesList.get(i).getAge());
//        }
        //challenge4
        System.out.println("\nchallenge4");
        collectionsChallenges.collectionPrintNoDuplicates();

    }
}
