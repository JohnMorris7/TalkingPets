package pets;

public abstract class Pet {

    String name;

    public Pet() {

    }
    public Pet(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String speak() {
        return null;
    }
    public Integer age() {
        return null;
    }
}
