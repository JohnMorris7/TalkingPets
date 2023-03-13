package pets;

public class Hamster extends Pet {

    public Hamster() {
    }

    @Override
    public Integer age() {
        return super.age();
    }

    public Hamster(String name) {
        super(name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String speak() {
        return "squeak";
    }
}

