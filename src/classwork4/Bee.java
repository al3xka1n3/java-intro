package classwork4;

public class Bee extends Insect implements Attack {

    private Attack attack;

    public Bee(int size, String color, Attack attack) {
        super(size, color);
        this.attack = attack;
    }

    public Bee(int size, String color) {
        super(size,color);
        this.attack = new AttackImpl("run", "bite");
    }

    public void move() {
        attack.move();
    }

    public void attack() {
        attack.attack();
    }
}
