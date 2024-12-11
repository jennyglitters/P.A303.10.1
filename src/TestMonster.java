public class TestMonster {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("r2u2");
        Monster m2 = new WaterMonster("u2r2");
        Monster m3 = new StoneMonster("r2r2");

        System.out.println(m1.attack());  // "Attack with fire!"
        System.out.println(m2.attack());  // "Attack with water!"
        System.out.println(m3.attack());  // "Attack with stones!"

        m1 = new StoneMonster("a2b2");
        System.out.println(m1.attack());  // "Attack with stones!"

        // Creating a Monster instance with an anonymous class for the missing implementation
        Monster m4 = new Monster("u2u2") {
            @Override
            public String attack() {
                return "!^_&^$@+%$* I don't know how to attack!";
            }
        };
        System.out.println(m4.attack());  // Garbage output
    }
}