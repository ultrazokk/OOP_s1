package main.java.com.example.units;

public class Peasant extends Person {
    private int arrowsNum;
    boolean inGame = true;

    public Peasant(String name, int age) {
        super(name, 40, 10, age, 10, 10, "nothing", 10); 
        this.arrowsNum = 10; 
    }
    
    public void giveArrows(int val) {
        this.arrowsNum += val; 
        if (this.arrowsNum <= 0) {
            inGame = false;
        }
    }

    public boolean isInGame() {
        return this.arrowsNum == 0 ? false : true;
    }
}
