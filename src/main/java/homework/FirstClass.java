package homework;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("This is Roberts Skudritis homework");

        //Valsts nosaukums String
        String countryName = "Somija";
        //Valsts dibinasanas gads
        int declarationYear = 1917;
        //Iedzivotaju skaits
        int populationCount = 5374781;
        //Teritorijas platiba
        double countrySize = 338424;
        //Valsts galvaspilseta
        String countryCapital = "Helsinki";
        //Valsts valoda
        String countryLanguage = "Somu un Zviedru";
        //Vai valsts ir ES dalibvalsts
        boolean isInEU = true;
        //Vai valsts ir NATO dalibvalsts
        boolean isInNATO = false;
        //Valsts valuta ir
        char countryCurrency = '€';
        //Sis gads
        int thisYear = 2022;


        System.out.println("Izvēlētā valsts ir " + countryName);
        System.out.println(countryName + " ir deklarēta " + declarationYear + ". gadā");
        System.out.println(countryName + " dzīvo " + populationCount + ", bet tās platība ir " + countrySize + " km2");
        System.out.println("Oficiālās valsts valodas ir " + countryLanguage);
        System.out.println("Vai " + countryName + " ir ES? " + isInEU);
        System.out.println("Vai " + countryName + " ir NATO? " + isInNATO);
        System.out.println("Valūta "+ countryName + " ir " + countryCurrency + " (eiro)");

        //Matematiskas darbibas
        //Valsts vecums
        int countryAge = thisYear - declarationYear;
        System.out.println(countryName + " vecums ir " + countryAge);
        //Udens platiba
        double countryWater = countrySize * 0.1;
        System.out.println(countryName + " no visas platības " + countryWater + " km2 ir ūdens");
        //Zemes platiba
        double countrySoil = countrySize - countryWater;
        System.out.println("Atlikusī platība  " + countrySoil + " km2 ir sauszeme");
        //Zemes platiba uz iedzivotaju
        double soilProportion = countrySoil / populationCount;
        System.out.println("Katram iedzīvotājam pienāktos  " + soilProportion + " km2 sauszemes");
        //Dalisana ar atlikumu
        double soilBalance = countrySoil % countryWater;
        System.out.println("Zemes platības un ūdens platības dalījuma atlikums ir  " + soilBalance);



    }


}
