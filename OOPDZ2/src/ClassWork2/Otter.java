package ClassWork2;

public class Otter extends Animal implements RunAble, SwimAble {

    public Otter(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String run() {
        return "23 km/h";
    }

    @Override
    public String swim() {
        return "35 km/h";
    }
}
