package animals;

public final class Amphibians extends Animal {

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }


    @Override
    void eat() {
        System.out.println("Amth eating");
    }

    @Override
    void sleep() {
        System.out.println("Amth sleeping");
    }

    @Override
    void move() {
        System.out.println("Amth moving");
    }

    void hunt(){
        System.out.println("Amph hunting");
    }
}
