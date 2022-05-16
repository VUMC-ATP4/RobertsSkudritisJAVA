package classroom;

import java.sql.SQLOutput;

public class Main {
    int timeout = 10;
    public static void main(String[] args) {
        System.out.println("Hello JAVA 1 Lekcija");

        int x = 5;
        int y = 10;
        double temperature = -20.4;
//komentars
        System.out.println("X ir vienāds ar:");
        System.out.println(x);
        System.out.println("Y ir vienāds ar:");
        System.out.println(y);
        System.out.println("X+Y ir vienāds ar:");
        System.out.println(x+y);
        //[Mainīgā tips] [Mainīgā nosaukums] = [Vērtība];
        //Vārdi un teikumi JAVA valodā tiek saglabāti mainīgā tipā String
        String dogName = "Reksis";
        //Veseli skaitļi tiek definēi ar mainīgā tipu int
        int dogAge = 10;
        //Daļskaitļi tiek definēi ar mainīgā tipu double vai float
        double dogWeight = 15.5;
        String dogBreed = "VAS";
        //Jā nē jautājums tiek definēts ar mainīgā tipu boolean
        boolean isHungry = false;
        boolean isDogVaccinated = true;
        //Vienu simbolu definē ar mainīgā tipu char
        char dogGender = 'M';
        char currency = 'E';
        int dogPrice = 100;

        System.out.println("Suņa vārds: " + dogName);
        System.out.println("Suņa vecums: " + dogAge);
        System.out.println("Suņa svars: " + dogWeight);
        System.out.println("Suņa suga: " + dogBreed);
        System.out.println("Vai suns ir izsalcis: " + isHungry);
        System.out.println("Vai suns ir vakcinēts: " + isDogVaccinated);
        System.out.println("Suņa dzimums ir " + dogGender);
        System.out.println("Suņa kucēni maksā " + dogPrice + currency);
//        System.out.println("Suņa vārds:" + dogName + \n "Suņa vecums:" + dogAge );


        int summa;
        int pirmaisSkaitlis = 10;
        int otraisSkaitlis = 8;


        int starpiba = pirmaisSkaitlis - otraisSkaitlis;
        summa = pirmaisSkaitlis + otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
        int atlikums = pirmaisSkaitlis % otraisSkaitlis;
//        int [] saraksts = {}

        int a = 1;
        int b = 4;
        int c = 7;

        System.out.println("Ja atlikums ir 0, tad para skailtis" + a%2);

        System.out.println(starpiba);
        System.out.println(summa);
        System.out.println(dalijums);
        System.out.println(reizinajums);
        System.out.println(atlikums);

        System.out.println(pirmaisSkaitlis + "+" + "(" + otraisSkaitlis + ")" + "=" + summa);




    }
}
