package main.java.com.example.units;

public class Wizard {
    private int mana;

    public void attack(Person person) {
        person.health -= this.power;
    }
    
}
