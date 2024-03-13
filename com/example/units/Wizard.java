package main.java.com.example.units;

public class Wizard extends Person{
    private int mana;
    private int healVal;
    private int healPrice;
    private int attackPrice;

    public Wizard(String name, int age){
        super(name, 40, 20, age, 20, 20, "wand", 40)
    }

    public void attack(Person person) {
        person.health -= this.power;
        this.mana -= this.attackPrice;
    }

    public void heal(Person person, int val) {
        person.health += val;
        this.mana -= price("heal");
    }

    public void heal(int val) {
        super.health += val;
    }

    private int price(String action) {
        if (action == "heal") return healPrice;
        return 0;

    }
    
}
