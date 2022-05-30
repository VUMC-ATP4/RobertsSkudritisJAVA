package homeworkTwoMethod;

public class HomeWorkTwoMetodes {

    //5.uzdevums
    static void printBusinessCard(){
        String name = ("Jānis");
        String surname = ("Bērziņš");
        int phoneNumber = 12345678;
        int birthYear = 1990;

        for (int i = 0; i < 3; i++) {
            System.out.println("Vizītkarte");
            System.out.println("#######");
            System.out.println("Vārds: " + name);
            System.out.println("Uzvārds: " + surname);
            System.out.println("Telefona numurs: +371 " + phoneNumber);
            System.out.println("Dzimšanas gads: " + birthYear);
            System.out.println();
        }
    }

    //6.uzdevums
//    static void printBusinessCardTwo(){
//        String name;
//        String surname;
//        int phoneNumber;
//        int birthYear;
//
//        for (int i = 0; i < 2; i++) {
//            System.out.println("Vizītkarte");
//            System.out.println("#######");
//            System.out.println("Vārds: " + name);
//            System.out.println("Uzvārds: " + surname);
//            System.out.println("Telefona numurs: +371 " + phoneNumber);
//            System.out.println("Dzimšanas gads: " + birthYear);
//            System.out.println();
//        }
    //7.uzdevums
    static int printSumma(int a, int b) {

        int summa = a + b;
        return summa;
    }

   //8.uzdevums
    static double printAvg(double c, double d, double e) {
        return (c + d + e) / 3;
    }

}