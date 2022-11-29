package animals;

public abstract class Mammal extends Animal {
    private final int speed;
    private String food;

    public Mammal(String name, int age, String livingEnvironment, int speed, String food) {
        super(name, age, livingEnvironment);
        this.speed = speed;
        this.food = food;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    abstract void walk();



}
