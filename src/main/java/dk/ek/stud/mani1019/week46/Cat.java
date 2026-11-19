package dk.ek.stud.mani1019.week46;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Miav";
    }

    @Override
    public boolean eat(String food) {
        return food.equals("fisk");
    }
}
