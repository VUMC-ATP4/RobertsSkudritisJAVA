package homeworkThree;
import java.util.Scanner;
import java.math.BigInteger;
//import static homeworThreeMetodes.HomeWorkTwoMetodes.*;
public class LoopHomeWork {
    public static void main(String[] args) {
        System.out.println("5. mājasdarbs");
        //1.uzdevums
        System.out.println("1.uzdevums");
        System.out.println("Ievadi veselus skaitļus!");
        System.out.println("Ievadi pirmo skaitli!");
        Scanner scannerTask1 = new Scanner(System.in);

        int number1 = scannerTask1.nextInt();
        int summa = number1;
        int number2 = 0;

        while (summa < 100) {

            System.out.println("Ievadi nākamo skaitli!");
            number2 = scannerTask1.nextInt();
            //informatīvs pārbaudes mehānisms
            System.out.println("Summa sākot ciklu " + summa);
            summa = summa + number2;
            //informatīvs pārbaudes mehānisms
            System.out.println("Summa saskaitot " + summa);
        }

        System.out.println("Gatavs! Ievadīto skaitļu summa jau ir sasniegusi 100, rezultāts ir " + summa);


        //2.uzdevums
        System.out.println("2.uzdevums");
        System.out.println("Ievadi veselu skaitli, kuru pārbaudīsim vai tas ir pirmskaitlis!");
        Scanner scannerTask2 = new Scanner(System.in);
        int primeNumber = scannerTask2.nextInt();
        int i,m=0,flag=0;
        m=primeNumber/2;
        if(primeNumber==0||primeNumber==1){
            System.out.println("Ievadītais skaitlis " + primeNumber + " nav pirmskaitlis");
        }else{
            for(i=2;i<=m;i++){
                if(primeNumber%i==0){
                    System.out.println(primeNumber+" nav pirmskaitlis");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(primeNumber+" nav pirmskaitlis"); }
            System.in.read();
        }

        //3. uzdevums
        System.out.println("3.uzdevums");
        System.out.println("Definējam trīs masīvus un izvadam to vērtības");
        String[] months = {"Janvāris", "Februāris", "Marts", "Aprīlis", "Maijs", "Jūnijs", "Jūlijs", "Augusts", "Septembris", "Oktobris"};
        int[] randomNumber = {0, 34, 21, 13, 8, 5, 3, 2, 1, 1};
        char[] randomChar = {'A', 'B', 'C', 'D', 'E', 'F', 'H', 'I', 'J', 'K'};
        int index = 0;
        System.out.println("Izvadām integer masīvu ar - while");
        while (index < randomNumber.length) {
        System.out.println(randomNumber[index]);
        index++;
}
        System.out.println("Izvadām integer masīvu ar - do while");
        index = 0;
        do {
        System.out.println(randomNumber[index]);
        index++;
}       while (index < randomNumber.length);

        System.out.println("Izvadām char masīvu ar - for each");
        for (char c:randomChar) {
        System.out.println(c);
        }

        System.out.println("Izvadām String masīvu ar - for loop");
        for (int iterator = 0; iterator<months.length; iterator++) {
            System.out.println(months[iterator]);
        }

        //4.uzdevums
        System.out.println("4.uzdevums");
        System.out.println("Masīvs ar veseliem pāra skaitļiem");
        int masivs[]= new int[100];
        //int evenNumber = 0;
        for (int evenNumber=0;evenNumber<masivs.length;evenNumber++)

        {
            masivs[evenNumber]=evenNumber;

            if(evenNumber%2==0)
                System.out.print(evenNumber +";");

        }
        System.out.println("");

        //5.uzdevums
        System.out.println("5.uzdevums");
        System.out.println("Ievadi veselu skaitli, kuram rēķināt faktoriālo vērtību!");
        Scanner scannerTask5 = new Scanner(System.in);
        int n = 1;
        BigInteger fact = BigInteger.ONE;
//        long fact = 1;
        int number = scannerTask5.nextInt();
        for(n = 1;n <= number;n++)
        {
//            fact = fact * n;
            fact = fact.multiply(BigInteger.valueOf(n));
        }
        System.out.println("Skaitļa "+number+" faktoriāls ir: "+fact);

        //6.uzdevums
        System.out.println("6.uzdevums");
        System.out.println("Paroles pārbaude!");
        Scanner scannerTask6 = new Scanner(System.in);
        System.out.println("Ievadi paroli");
        final int PASSWORD = 4444;
        //int PASSWORD = 4;
        int attempts = 3;
        int password = 0;
        while (attempts-- > 0 && PASSWORD!=(password))
        {
            System.out.print("Ievadi PIN: ");
            password = scannerTask6.nextInt();
            if (password==(PASSWORD))
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");

            else
                System.out.println("Nepareizs PIN! Atlikuši " + attempts + " mēģinājumi");

            if (attempts <= 0) {
            System.out.println("===!!!===!!!===!!!===!!!===!!!===");
            System.out.println("Atvainojiet, bet jūs esat bloķēts");
            System.out.println("===!!!===!!!===!!!===!!!===!!!===");}
        }


    }
}
//public class Factorial {
//
//
//
//
//}