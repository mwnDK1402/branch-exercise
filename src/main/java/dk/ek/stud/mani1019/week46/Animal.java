package dk.ek.stud.mani1019.week46;

public abstract class Animal {

    private String name;

    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();

    public abstract boolean eat(String food);

    public int getAge() {
        return age;
    }
}
