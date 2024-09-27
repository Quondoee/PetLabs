package pet;

public class Parrot extends Pets {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Squawk!";
    }
}
