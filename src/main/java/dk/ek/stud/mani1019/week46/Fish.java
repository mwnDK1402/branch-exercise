package dk.ek.stud.mani1019.week46;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Blub";
    }

    @Override
    public boolean eat(String food) {
        return food.equals("Plankton");
    }
}
