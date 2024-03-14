package main.java.com.example.units;

public class Pikeman extends Person {
    public Pikeman(String name, int age) {
        super(name, 90, 30, age, 30, 50, "pike", 20);

    }

    public void attack(Person person) {
        person.health -= this.power;
        
}
}
