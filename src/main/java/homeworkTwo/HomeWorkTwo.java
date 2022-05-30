package homeworkTwoMethod;
import java.util.Scanner;

//import static homeworkTwoMethod.HomeWorkTwoMetodes.printBusinessCardTwo;
import static homeworkTwoMethod.HomeWorkTwoMetodes.*;


public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. uzdevums
        int x = 1;
        System.out.println(x > 0);
        x = 4;
        System.out.println(x < 0);
        System.out.println(5 > x && x <= 10);
        System.out.println((x != 5 && x < 5) && x <= 10);
        System.out.println(x == 0 && x == 10);
        System.out.println(x*x > 10);

        //4.uzdevums
        System.out.println("Ievadi luksafora gaismu - zals, dzeltens vai sarkans");
        String color = scanner.nextLine();


        if (color.equals("zals")) {
            System.out.println("Var doties pāri ielai!");
        }

        else if (color.equals("dzeltens")) {
            System.out.println("Dzeltens! Gaidi!!");
        }

        else if (color.equals("sarkans")) {
            System.out.println("Sarkans! Gaidi!!");
        }

        else {
            System.out.println("Nepareiza ievade");
        }

        //2.uzdevums
        System.out.println("Ievadi mēneša numuru!");
        int month;
        month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
            default:
                System.out.println("Mēnesis" + month + " nav definēts");
        }


        //3.uzdevums
        System.out.println("Ievadi trīs veselus skaitļus!");
        System.out.println("Ievadi pirmo veselo skaitli!");
        int firstNumber;
        firstNumber = scanner.nextInt();
        System.out.println("Ievadi otro veselo skaitli!");
        int secondNumber;
        secondNumber = scanner.nextInt();
        System.out.println("Ievadi trešo veselo skaitli!");
        int thirdNumber;
        thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Lielākais ievadītais skaitlis ir " +firstNumber);
        }

        if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Lielākais ievadītais skaitlis ir " +secondNumber);
        }

        if (thirdNumber > secondNumber && thirdNumber > firstNumber) {
            System.out.println("Lielākais ievadītais skaitlis ir " +thirdNumber);
        }

        //5.uzdevums
        printBusinessCard();

        //6.uzdevums
//        String name;
//        String surname;
//        int phoneNumber;
//        int birthYear;
//        printBusinessCardTwo(name);

        //7.uzdevums
        int result;
        System.out.println("Ievadi pirmo veselo skaitli!");
        int a = scanner.nextInt();
        System.out.println("Ievadi otro veselo skaitli!");
        int b = scanner.nextInt();
      //  result = printSumma(5, 6);
        result = printSumma(a, b);
        System.out.println("Skaitļu summa ir " +result);

        //8.uzdevums
        System.out.println("Ievadi pirmo skaitli!");
        double c = scanner.nextDouble();
        System.out.println("Ievadi otro skaitli!");
        double d = scanner.nextDouble();
        System.out.println("Ievadi trešo skaitli!");
        double e = scanner.nextDouble();
        System.out.println("Vidējā vērtība ir " + printAvg(c,d,e));
    }
}