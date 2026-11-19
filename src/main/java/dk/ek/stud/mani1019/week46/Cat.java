package dk.ek.stud.mani1019.week46;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Mjav";
    }
}
