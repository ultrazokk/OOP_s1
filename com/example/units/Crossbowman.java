package main.java.com.example.units;

public class Crossbowman extends Person{
    public Crossbowman(String name, int age) {
        super(name, 70, 50, age, 20, 30, "crossbow", 20);

    }
    public void attack(Person person) {
        person.health -= this.power;
    }
    
}
