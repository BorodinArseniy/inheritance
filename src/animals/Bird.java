package animals;

public abstract class Bird extends Animal{
    private boolean isFlying;

    public Bird(String name, int age, String livingEnvironment, boolean isFlying) {
        super(name, age, livingEnvironment);
        this.isFlying = isFlying;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }


}
