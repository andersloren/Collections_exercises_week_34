package lexicon;

import java.util.*;

public class CollectionsChallenges {

    public void compareTwoSetsOfWeekDays() {
        //challenge1
        HashSet<String> weekDays = new HashSet<>();
        weekDays.add("monday");
        weekDays.add("tuesday");
        weekDays.add("wednesday");
        weekDays.add("thursday");
        weekDays.add("friday");
        weekDays.add("saturday");
        weekDays.add("sunday");

        HashSet<String> someWeekDays = new HashSet<>();
        someWeekDays.add("saturday");
        someWeekDays.add("sunday");

        weekDays.retainAll(someWeekDays);
//        System.out.println(weekDays);
    }

    public void setsOfSetKeys() {
        //challenge2
        HashMap<String, String> nameToEmail = new HashMap<>();
        nameToEmail.put("anders", "a@gmail.com");
        nameToEmail.put("benny", "b@gmail.com");
        nameToEmail.put("charles", "c@gmail.com");

        HashSet<String> keySet = new HashSet<>(nameToEmail.keySet());
    //        System.out.println(keySet);
    }

    public void collectionPrintNoDuplicates() {
        ArrayList<Integer> numbersArray = new ArrayList<>();
        numbersArray.add(1);
        numbersArray.add(4);
        numbersArray.add(4);
        numbersArray.add(2);
        numbersArray.add(6);
        numbersArray.add(7);

        HashSet<Integer> numbersHashSet = new HashSet<>(numbersArray);
        System.out.println(numbersHashSet);
    }
}
