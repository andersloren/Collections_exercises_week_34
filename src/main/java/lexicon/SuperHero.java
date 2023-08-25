package lexicon;

public class SuperHero implements Comparable<SuperHero> {

    // ******
    // Fields
    // ******
    private int Id;
    private String name;
    private int age;
    private static int sequencer;

    // **************
    // Constructor(s)
    // **************


    public SuperHero(String name, int age) {
        setId(sequencer());
        setName(name);
        setAge(age);
    }

    // *******
    // Methods
    // *******
    public int sequencer() {
        return ++sequencer;
    }

    // ******************************************
    // Overridden methods from 'java.lang.Object'
    // ******************************************
    @Override
    public int compareTo(SuperHero o) {
        if (this.getAge() < o.getAge()) {
            return -1;
        } else if (this.getAge() == o.getAge()) {
            return 0;
        } else {
            return 1;
        }
    }

    // *****************
    // Getters & Setters
    // *****************

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
