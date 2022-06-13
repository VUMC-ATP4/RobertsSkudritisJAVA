package classroomFour;

public class House {
    String ielasNosaukums;
    int majasNumurs;
    int stavuSkaits;
    int ieejuSkaits;
    int istabuSkaits;
    double platiba;
    int cena;
   // Cena cena;
    boolean irStaavvieta;
    char valuta;

    public double cenaKvadrametra(){
        return cena/platiba;
//        return cena.cena/platiba;
    }

    public void printetAdresi(){
        System.out.println("Mājas adrese ir: " + ielasNosaukums + " " + majasNumurs);

    }
    public void printetPilnuInfo(){
        System.out.println("Mājas stāvu skaits ir: " + stavuSkaits + " un ir " + ieejuSkaits + " ieejas.");
        System.out.println("Mājas platība ir: " + platiba + " m2");
        System.out.println("Mājai ir stavvieta: " + irStaavvieta + " un tās cena ir " + cena);
        System.out.println("Cena kvardātmetrā ir " + cena/platiba);
    }


}
