package Inheritance;

public class Main {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        // System.out.println(plant.Photosynthesis);

        cat.sleeps();
        dog.sleeps();
        plant.sleeps();

        // System.out.println(dog.lives);
        // System.out.println(cat.lives);

        // Person person = new Person ("Kakashi","Hatake");
        // Students student = new Students("Naruto", "Uzumaki", 7.25);
        // Teachers teacher = new Teachers("Jiraya", "Sensei", "Legends");

        // person.name();
        // student.name();
        // teacher.name();

        // student.showGPA();
        // teacher.showSubject();

    }
}
