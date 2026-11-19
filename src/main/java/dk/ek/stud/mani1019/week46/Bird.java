package dk.ek.stud.mani1019.week46;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Pip";
    }

    @Override
    public boolean eat(String food) {
        return food.equals("frø");
    }
}
