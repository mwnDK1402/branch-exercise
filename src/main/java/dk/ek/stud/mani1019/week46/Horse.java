package dk.ek.stud.mani1019.week46;

public final class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "neigh";
    }

    @Override
    public boolean eat(String food) {
        return "hay".equalsIgnoreCase(food);
    }
}
