package pets;

public class Hamster extends Pet {

    public Hamster() {
    }

    public Hamster(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "squeak";
    }
}

