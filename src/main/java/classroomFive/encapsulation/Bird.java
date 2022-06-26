package classroomFive.encapsulation;

public class Bird {
public String colour;
    private String name = "Pollija";

    //varam piekļūt no citām klasēm
public void printText(){
    System.out.println("Šī ir publiska metode");
    System.out.println("Printēju putnu");
}
//varam piekļūt tikai no šīs klases
private void printTextSpecial(){
    System.out.println("Šī ir privāta metode");
}
//varam piekļūt pakotnes ietvaros
void defaultMethodExample(){
    System.out.println("Šī ir default metode");
}

}
