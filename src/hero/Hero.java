package hero;

public abstract class Hero extends Human {
    public Hero(String name) {
        super(name);
    }

    @Override
    public String whoAmI() {
        return String.format("%s %s", this.getClass().getSimpleName(), super.name);
    }
}
