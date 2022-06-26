package classroomFive.inheritance;

public class Example {

    public static void main(String[] args) {

        Dog dog1 = new Dog(4, "Reksis");
        Octopus octopus1 = new Octopus(8, "Lols");
        Chicken chicken1 = new Chicken(2, "Plepi");
    dog1.printLegCount();
    octopus1.printLegCount();
    chicken1.printLegCount();
        System.out.println(octopus1.waterType);
      //  System.out.println(dog1);
        Fox lapsa = new Fox ("Kūmiņš", 4);
        Animal[] dzivnieki = {dog1, octopus1, chicken1};

        for (int i = 0; i< dzivnieki.length; i++){
            dzivnieki[i].printLegCount();
        }

        dog1.makeSound();
        chicken1.makeSound();


    }

}
