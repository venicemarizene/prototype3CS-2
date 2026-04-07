public class Horse implements Animal {
    private Integer legs;
    private String sound;
    private String food;
    private String color;

    public Horse(Integer legs, String sound, String food, String color) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.color = color;
    }

    @Override
    public Animal clone() {
        return new Horse(legs, sound, food, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Neigh");
    }

    @Override
    public String getType() {
        return "Horse";
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}