package animals;

public class Main {
    public static void main(String[] args){
        Animal gazelle = new Herbivore("gazelle", 10, "grass", 20, "grass");
        Animal tiger = new Predator("tiger", 10, "jungle", 30, "gazelle");
        Animal frog = new Amphibians("frog", 10, "swamp");
        Animal penguin = new NotFlyingBird("penguin", 10, "ice", false);
        Animal gull = new FlyingBird("gull", 10, "sky", true);

    }
}
