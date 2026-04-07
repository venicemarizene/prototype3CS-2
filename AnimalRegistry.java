public class AnimalRegistry {
    private Sheep sheep;
    private Cow cow;
    private Horse horse;

    public AnimalRegistry() {
        sheep = new Sheep(4, "Baa", "Grass", "DefaultSheep");
        cow = new Cow(4, "Moo", "Grass");
        horse = new Horse(4, "Neigh", "Hay", "White");
    }

    public Animal createSheep() {
        return sheep.clone();
    }

    public Animal createCow() {
        return cow.clone();
    }

    public Animal createHorse() {
        return horse.clone();
    }
}