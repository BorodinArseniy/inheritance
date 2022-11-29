package animals;

public final class Herbivore extends Mammal {
    public Herbivore(String name, int age, String livingEnvironment, int speed, String food) {
        super(name, age, livingEnvironment, speed, food);
    }

    @Override
    void walk() {
        System.out.println("Herbivore walking");
    }


    @Override
    void eat() {
        System.out.println("Herbivore eating");
    }

    @Override
    void sleep() {
        System.out.println("Herbivore sleeping");
    }

    @Override
    void move() {
        System.out.println("Herbivore moving");
    }

    void graze(){
        System.out.println("Herbivore grazing");
    }

}
