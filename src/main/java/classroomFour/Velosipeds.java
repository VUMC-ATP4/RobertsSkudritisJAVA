package classroomFour;

public class Velosipeds {
    int atrums;
    String nosaukums;
    String krasa;
    int svarsGramos;
    double rataIzmers;
    int atrumi = 21;
    String bremzuTips = "";


    public void bremze() {
        if (bremzuTips.equals("V-veida")) {
            atrums = atrums - 2;
        } else if (bremzuTips.equals("Disku")) {
            atrums = atrums - 3;
        } else {
            atrums = atrums - 1;
        }
    }


    public void spiedPedalus(){
        atrums++;
    }
}
