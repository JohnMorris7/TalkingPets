package pets;

public class Dog extends Pet {

    public Dog(){

    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public Integer age() {
        return super.age();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String speak() {
        return "Woof";
    }
}
