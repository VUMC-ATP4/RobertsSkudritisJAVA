package classroomFive.inheritance;

public class Dog extends Animal {


    public Dog(int legCount, String name) {
        super(legCount, name);
    }

    public void makeSound(){
        System.out.println("Es esmu suns. Vau vau vau....");

    }
}
