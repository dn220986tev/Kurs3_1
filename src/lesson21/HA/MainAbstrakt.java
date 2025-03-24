package lesson21.HA;

public class MainAbstrakt {
    public static void main(String[] args) {

        Hundin hundin = new Hundin("Sonya", "Dnipro", 9);
        hundin.essen();
        hundin.steuer();
        hundin.krankerkasse();

        String hundinNahme = hundin.name;
        System.out.println("Die Nahme:" +hundinNahme);
        System.out.println("Heimat:" + hundin.heimat);
        System.out.println("Alter:" +hundin.alter);

        hundin.werBinIch();
        System.out.println("---");

        Mitbewohnerin mitbewohnerin = new Mitbewohnerin("Dscha", "Kuiv", 28);
        mitbewohnerin.kommunikazion();
        mitbewohnerin.miete();
        mitbewohnerin.gassi();

        String name = mitbewohnerin.name;
        System.out.println("Die Nahme:" +name);
        System.out.println("Heimat:" + mitbewohnerin.heimat);
        System.out.println("Alter:" +mitbewohnerin.alter);

        mitbewohnerin.werBinIch();


        System.out.println("---");

        Freund freund = new Freund("Man", "China", 38);
        freund.essen();
        freund.kommunikazion();
        freund.treffen();

        String freundname = freund.name;
        System.out.println("Die Nahme:" +freundname);
        System.out.println("Heimat:" + freund.heimat);
        System.out.println("Alter:" +freund.alter);

        freund.werBinIch();



    }
}