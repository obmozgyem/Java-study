package HomeWork1503.Task1;

public abstract class Pet{
    private String name;


    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String play();

}
