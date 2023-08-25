package lexicon;

import java.util.*;


public class CollectionsExercises {
    public void weekDays() {
        // ex1
        List<String> weekDays = new ArrayList<>();
        weekDays.add("monday");
        weekDays.add("tuesday");
        weekDays.add("wednesday");
        weekDays.add("thursday");
        weekDays.add("friday");
        weekDays.add("saturday");
        weekDays.add("sunday");

        System.out.println(weekDays);
    }
    public void weekDaysIterate() {
        // ex2
        List<String> weekDays = new ArrayList<>();
        weekDays.add("monday");
        weekDays.add("tuesday");
        weekDays.add("wednesday");
        weekDays.add("thursday");
        weekDays.add("friday");
        weekDays.add("saturday");
        weekDays.add("sunday");

        Iterator<String> iterator = weekDays.iterator();

        while (iterator.hasNext()) {
            String day = iterator.next();
            System.out.println(day);
        }
    }
    public void weekExcludeThursdayAddThursday() {
        // ex3
        List<String> weekDays = new ArrayList<>();
        weekDays.add("monday");
        weekDays.add("tuesday");
        weekDays.add("wednesday");
        //weekDays.add("thursday");
        weekDays.add("friday");
        weekDays.add("saturday");
        weekDays.add("sunday");

        weekDays.add(3, "thursday");
        //System.out.println(weekDays);
    }

    public void threeFirstDaysOfWeek() {
        //ex4
        List<String> weekDays = new ArrayList<>();
        weekDays.add("monday");
        weekDays.add("tuesday");
        weekDays.add("wednesday");
        weekDays.add("thursday");
        weekDays.add("friday");
        weekDays.add("saturday");
        weekDays.add("sunday");

        System.out.println("Using for loop");
        List<String> threeDays1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            threeDays1.add(weekDays.get(i));
            System.out.println(threeDays1.get(i));
        }

        System.out.println("Using subList");
        List<String> threeDays2 = weekDays.subList(0, 3);
        for (String day : threeDays2) {
            System.out.println(day);
        }
    }

    public void hashWeekDays() {
        //ex5
        HashSet<String> weekDays = new HashSet<>();
        weekDays.add("monday");
        weekDays.add("tuesday");
        weekDays.add("wednesday");
        weekDays.add("thursday");
        weekDays.add("friday");
        weekDays.add("saturday");
        weekDays.add("sunday");

        for (String day : weekDays) {
//            System.out.println("Day: " + day + ", hash code: " + day.hashCode());
            System.out.println(day);
        }
    }

    public void convertHashSetToArrayList() {
        HashSet<String> hashSetWeekDays = new HashSet<>();
        hashSetWeekDays.add("monday");
        hashSetWeekDays.add("tuesday");
        hashSetWeekDays.add("wednesday");
        hashSetWeekDays.add("thursday");
        hashSetWeekDays.add("friday");
        hashSetWeekDays.add("saturday");
        hashSetWeekDays.add("sunday");

        ArrayList<String> arrayListWeekDays = new ArrayList<>(hashSetWeekDays);
//        System.out.println(arrayListWeekDays);
    }
    public void convertHashSetToArrayListAndPrint() {
        //ex7
        HashSet<String> randomNames = new HashSet<>();
        randomNames.add("anders");
        randomNames.add("mikael");
        randomNames.add("mehrdad");

        ArrayList<String> arrayListRandomNames = new ArrayList<>(randomNames);
        Collections.sort(arrayListRandomNames);

        System.out.println(arrayListRandomNames);
    }

    public void randomNamesSortedUsingSet() {
        //ex8
        Set<String> randomNames = new HashSet<>();
        randomNames.add("anders");
        randomNames.add("mikael");
        randomNames.add("mehrdad");
        randomNames.add("benny");

        Set<String> sortedNames = new TreeSet<>(randomNames);
        System.out.println(sortedNames);
    }

    public void printHashMap() {
        //ex9
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Volvo");
        hashMap.put(2, "Saab");
        hashMap.put(3, "Scania");

        System.out.println(hashMap);
    }

    public void printHashMapKeys() {
        //ex10
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Volvo");
        hashMap.put(2, "Saab");
        hashMap.put(3, "Scania");

        System.out.println(hashMap.keySet());
    }

    public void printHashMapValues() {
        //ex11
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Volvo");
        hashMap.put(2, "Saab");
        hashMap.put(3, "Scania");

        System.out.println(hashMap.values());
    }
}
