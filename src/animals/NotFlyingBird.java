package animals;

public final class NotFlyingBird extends Bird {
    public NotFlyingBird(String name, int age, String livingEnvironment, boolean isFlying) {
        super(name, age, livingEnvironment, isFlying);
    }


    @Override
    void eat() {
        System.out.println("Not Flying bird eating");
    }

    @Override
    void sleep() {
        System.out.println("Not Flying bird sleeping");
    }

    @Override
    void move() {
        System.out.println("Not Flying bird moving");
    }

    void walk(){
        System.out.println("Flying bird flying");
    }
}
