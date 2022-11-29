package animals;


import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;
    private String livingEnvironment;

    protected Animal(String name, int age, String livingEnvironment) {
        this.name = name;
        this.age = age;
        this.livingEnvironment = livingEnvironment;
    }

    //region
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    //endregion

    abstract void eat();
    abstract void sleep();
    abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }




}
