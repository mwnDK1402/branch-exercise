package dk.ek.stud.mani1019.week46;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        System.out.println("Velkommen til dyrehaven");

        Animal[] animals = {new Dog("Fido", 5), new Cat("Misser", 10), new Fish("Nemo", 3), new Bird("Pippi", 1)};

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " (" + animal.getAge() + " år) siger " + animal.makeSound());
            System.out.println(animal.getName() + " spiser \uD83D\uDC1F: " + animal.eat("fisk"));
        }
    }
}

