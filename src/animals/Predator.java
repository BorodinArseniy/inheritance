package animals;

public final class Predator extends Mammal {
    public Predator(String name, int age, String livingEnvironment, int speed, String food) {
        super(name, age, livingEnvironment, speed, food);
    }

    @Override
    void walk() {
        System.out.println("Predator walking");
    }


    @Override
    void eat() {
        System.out.println("Predator eating");
    }

    @Override
    void sleep() {
        System.out.println("Predator sleeping");
    }

    @Override
    void move() {
        System.out.println("Predator moving");
    }

    void hunt(){
        System.out.println("Predator hunting");
    }



}
