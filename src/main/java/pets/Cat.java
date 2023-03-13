package pets;

public class Cat extends Pet{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Integer age() {
        return super.age();
    }

    @Override
    public String speak() {
       return "Meow";
    }

}
