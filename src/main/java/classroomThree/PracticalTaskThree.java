package classroomThree;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PracticalTaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//masivi
        String[] gadalaiki = {"Pavasaris", "Vasara", "Ŗudens", "Ziema"};
        int[] fibonacciNumbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        double[] randomSkaitli = {21.3, 323.23, 412.32};


        System.out.println(gadalaiki[0]);
        System.out.println("Masīva garums ir: " + gadalaiki.length);

        gadalaiki[1] = "Pavasaris";
        System.out.println(gadalaiki[1]);

        System.out.println(gadalaiki[0]);
        System.out.println(gadalaiki[1]);
        System.out.println(gadalaiki[2]);
        System.out.println(gadalaiki[3]);
        System.out.println(fibonacciNumbers[4]);


        //masivs ar cilveku vardiem
        String[] cilveki = {"Juris", "Pēteris", "Anna"};
        int[] vecums = {33, 40, 28};
        System.out.println("Vārds: " + cilveki[0] + "\n" + "Vecums: " + vecums[0]);


//        static void printCilveks(String[] humans, int[] ages,int index){
//            System.out.println("Vārds:" + humans[index] + "\n" + "Vecums: " + ages[index]);

//            printCilveks(cilveki, vecums, 1);


        String[] germanCars = new String[4];
        germanCars[0] = "Mercedes";
        germanCars[1] = "Audi";
        germanCars[2] = "BMW";
        germanCars[3] = "Opel";
        System.out.println(germanCars[3]);

        int iterators = 0;
        while (iterators < germanCars.length) {
            System.out.println(germanCars[iterators]);
            iterators++;

        }


        //   int[] mansMasivs = generateArray();
        //  System.out.println(mansMasivs[0]+""+ mansMasivs[1] +""+ mansMasivs[2]);


        int i = 0;
        while (i < 5) {
            System.out.println("I ir :" + i);
            //i = i +1;
            i++;
        }
        System.out.println("cikla izeja");

        int q = 10;
        while (q > 1) {
            System.out.println("Q ir: " + q);
            q--; // same as q = q-1
        }

        int[] bingoLotoLaimigieSkaitli = {3, 5, 48, 7, 6, 31};
//            int counter = 0;
//            while (counter<bingoLotoLaimigieSkaitli.length);{
//        System.out.println(bingoLotoLaimigieSkaitli[counter]);
//        counter++;
        printIntArray(bingoLotoLaimigieSkaitli);

//        Scanner scanner = new Scanner(System.in);
//        String parole = "Parole123";
//        String lietotajaParole;
//        do {
//            System.out.println("Ievadi paroli");
//            lietotajaParole = scanner.nextLine(); //Parole123
//            System.out.println("Pārbaudām paroli");
//        } while (!lietotajaParole.equals(parole));
//        System.out.println("Pareiza parole");

        // Šobrīd ciematā ir iespēja iegādāties mājas ar mājas numuriem no 1 līdz 50.
        // Pircējs  vēlas iegādāties māju ciematā, bet viņš nevēlas māju, kuras numurs dalās ar 3 vai 5.
        // Cik māju numuri atbilst prasībām?

        for (int j = 1; j <=50 ; j++) {
            if((j%3==0)||(j%5==0)){
                System.out.println("Šis numurs mums neder " + j);
            }else{
                System.out.println("Šis numurs mums der " + j);
            }
        }



    }

//    String [] kartis = {"Pīķa dūzis","Ercena kalps","Kārava dāma"};
//    int karts = 0;
//        System.out.println(String.format("Man rokā ir %s kārtis ", kartis.length));
//        while(karts<kartis.length){
//        System.out.println(kartis[karts]);
//        karts++;
//    }




static int sumPositiveNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ieraksti skaitli");
        int number = scanner.nextInt();
        int summa = 0;
        while(number >=0); {
            summa = summa + number;
        System.out.println("Ieraksti numuru");
        number = scanner.nextInt();
    }
    System.out.println("Pozitīvo skaitļu summa ir: " + summa);
        return summa;
}

static void printIntArray(int[] randomMasivs){
    int counter = 0;
    while (counter<randomMasivs.length);{
        System.out.println(randomMasivs[counter]);
        counter++;

}}

    static void printStringArray(String[] randomMasivs){
        int counter = 0;
        while(counter < randomMasivs.length){
            System.out.println(randomMasivs[counter]);
            counter++;
        }
    }





        static int[] generateArray(){
            Scanner scanner  = new Scanner(System.in);
            System.out.println("Ievadi pirmo skaitli...");
            int a = scanner.nextInt();
            System.out.println("Ievadi otro skaitli...");
            int b = scanner.nextInt();
            System.out.println("Ievadi trešo skaitli...");
            int c = scanner.nextInt();
            int[] skaitluMasivs = {a, b, c};
            return skaitluMasivs;
        }


}
