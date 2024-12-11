public abstract class Monster {
    protected String name;  // 'protected' means accessible to this class and its subclasses

    public Monster(String name) {  // Constructor to initialize the monster's name
        this.name = name;
    }

    public abstract String attack();  // Abstract method, must be implemented by subclasses
}