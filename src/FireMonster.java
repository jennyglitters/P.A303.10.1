public class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);  // Call the superclass constructor
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }
}