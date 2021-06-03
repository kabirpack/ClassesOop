package com.polymorphism;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No Plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws() {
        super ("Jaws"); // initialising name field
    }

    public String plot(){
        return "A shark movie";
    }
}

class Avengers extends Movie {
    public Avengers() {
        super("Avengers");
    }

    @Override
    public String plot() {
        return "super hero movie";
    }
}

class Conjuring extends Movie{
    public Conjuring() {
        super("Conjuring");
    }

    @Override
    public String plot() {
        return "Horror Ghost movie";
    }
}

class DarkKnight extends Movie{
    public DarkKnight() {
        super("DarkKnight");
    }

    @Override
    public String plot() {
        return "A normal man can be a super hero";
    }
}

class Forgetable extends Movie{
    public Forgetable() {
        super("Forgettable");
    }

    // no plot here.
}

// main method
public class PolymorphismMain {
    public static void main(String[] args){
        for(int i=1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ":" + movie.getName() + "\n" +
                                "plot: " + movie.plot() + "\n"); // polymorphism implemented.
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5)+1;
        System.out.println("Random number geberated was: " + randomNumber);

        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new Avengers();
            case 3:
                return new Conjuring();
            case 4:
                return new DarkKnight();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
