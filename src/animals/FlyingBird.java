package animals;

public final class FlyingBird extends Bird {
    public FlyingBird(String name, int age, String livingEnvironment, boolean isFlying) {
        super(name, age, livingEnvironment, isFlying);
    }

    @Override
    void eat() {
        System.out.println("Flying bird eating");
    }

    @Override
    void sleep() {
        System.out.println("Flying bird sleeping");
    }

    @Override
    void move() {
        System.out.println("Flying bird moving");
    }

    void fly(){
        System.out.println("Flying bird walking");
    }
}
