package dk.ek.stud.mani1019.week46;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Vuf";
    }

    @Override
    public boolean eat(String food) {
        return true;
    }
}
