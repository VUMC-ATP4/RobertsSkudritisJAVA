package classroomTwo;

import java.util.Scanner;

public class PracticalTaskTwo {
    public static void main(String[] args) {
        System.out.println("Šī ir otrā JAVA lekcija");
        //Tips  nosaukums  deklaracija
        Scanner scanner = new Scanner(System.in);
//        int vecums;
//
//        System.out.println("Paskaties cilvēka pasē?");
//
//        vecums = scanner.nextInt();
//        if (vecums >= 18) {
//            System.out.println("Drikst balsot");
//        }else{
//            System.out.println("Nedrīkst balsot");
//        }


        int x = 10;
        int y = 20;

        if (y > x && x > 5){
            System.out.println("y ir lielāks par x un lielāks par 5");
        }


        int skaitlis = 15;

        if (skaitlis == 10)
        {
            System.out.println("Skaitlis  = 10");
        } else if (skaitlis == 15)
        {
            System.out.println("Skaitlis = 15");
        } else if (skaitlis == 20)
        {
            System.out.println("skaitlis = 20");
        } else {
            System.out.println("Skaitlis nezināms");
        }

        int vecums;
        boolean canVote = false;


        System.out.println("Paskaties cilvēka pasē?");
        vecums = scanner.nextInt();
        if (vecums >= 18) {
            canVote = true;
        }

        if(canVote){
            System.out.println("Cilveks var balsot");
        } else{
            System.out.println("Cilveks nevar balsot");
        }

        int month = 2;

        switch (month) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 12:
                System.out.println("Decembris");
            default:
                System.out.println("Mēnesis" + month + " nav definets");
        }

        int q = 10;

        if(q>0){
            System.out.println("Skaitlis ir lielaks par nulli");
        }

        int cilvekaVecums=65;
        char dzimums = 'V';
        boolean drikstDoties = false;

        if(dzimums=='V' && cilvekaVecums >=65){
            drikstDoties = true;
        } else if(dzimums=='S' && cilvekaVecums>=60){
            drikstDoties=true;
        }

        System.out.println("Cilveks drikst doties pensija " + drikstDoties);

        int skaitlisX = 14;

        if (skaitlisX % 2 == 0) {
            System.out.println("Skaitlis ir pāra");
        } else {
            System.out.println("Skaitlis ir nepāra");
        }


//        System.out.println("ievadi savu vārdu");
//        String vards = scanner.nextLine();
//        System.out.println("Labdien "+vards + "!");
//        System.out.println("Esi sveicināts kalkulatora programmā!");

//        int a;
//        int b;
//
//        System.out.println("Ievadi skaitli a");
//        a = scanner.nextInt();
//        System.out.println("Ievadi skaitli b");
//        b = scanner.nextInt();
//        int summa = a + b;
//       // System.out.println(String.format("%s, %s + %s = %s", vards, a, b, summa));
//        System.out.println(a > b);

//        System.out.println("Šeit jābūt nepatiesam: " + (5>10));
//        System.out.println((5<10));
//        System.out.println(6==5); //false
//        System.out.println(5==5);   //true
//        System.out.println(6!=5); //true
//        System.out.println(5!=5); //false
  //      int vecums = 18;
//        System.out.println(vecums > 18);
//        System.out.println("Šeit jābūt nepatiesam: " + (5 > 10));
//        System.out.println((5 < 10));
//        System.out.println(6 == 5); //false
//        System.out.println(5 == 5);   //true
//        System.out.println(6 != 5); //true
//        System.out.println(5 != 5); //false

//        System.out.println(vecums >= 18);
//        int bernaVecums = 5;
//        System.out.println(bernaVecums<=5);
//        System.out.println(vecums>bernaVecums);
//        boolean isEligibleToVote = vecums >= 18;
//        System.out.println("Vai cilvēks drīkst balsot ? " + isEligibleToVote);
//        String name = "Juris";
//        String nameTwo = "Juris";
//        System.out.println(name.equals(nameTwo));
//
//        System.out.println("Ievadi X");
//        int x = 4;
//        //int x = scanner.nextInt();
//        boolean vaiIrPatiess = ((x < 5) && (x < 10) && 1!=1); //true
//        x = 5;
//        System.out.println((x < 5 && x < 10)); // false
//        System.out.println((x < 5 || x < 10)); // false
//        System.out.println(vaiIrPatiess);

//        String teksts;
//        String name = "Roberts";
//        teksts = String.format("Mani sauc %s", name);
//        System.out.println(teksts);
//piemers ar string format
//        double a = 100.25;
//        int b = 10;
//
//        //System.out.println("a-b = " + (b / a));
//        System.out.println(String.format("%.2f",(b / a)));
//
//        String name = "Roberts";
//        String surname = "Skudrītis";
//        String role = "Students";
//        double videjaAtzime = 7.3214;
//
//        String concatTeikums = "Mani sauc " + name + " Mans uzvārds ir " + surname + " Es esmu " + role;
//        String teikums = String.format("Mani sauc %s. Mans uzvārds ir %s. Es esmu %s. Mana vid atz ir %.1f",name,surname,role,videjaAtzime);
//
//        System.out.println(teikums);
//        System.out.println(concatTeikums);





    }

}
