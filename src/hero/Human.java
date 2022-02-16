package hero;

public class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public String whoAmI() {
        return this.name;
    }
}
