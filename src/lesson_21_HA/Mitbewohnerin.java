package lesson_21_HA;

public class Mitbewohnerin {
    String name;
    String heimat;
    int alter;

    public Mitbewohnerin(){

    }
    public Mitbewohnerin(String mitbewohnerinsNahme){
        name =mitbewohnerinsNahme;
    }

    public Mitbewohnerin(String mitbewohnerinsNahme, String heimat){
        name = mitbewohnerinsNahme;
        this.heimat= heimat;
    }

    public Mitbewohnerin(String name, String heimat, int alter){
        this(name, heimat);
        this.alter = alter;
    }

    public void kommunikazion(){
        System.out.println("Ich spreche mit meiner Mitbewohnering taglich");
    }
    public void miete(){
        System.out.println("Wir bezahlen alleszur Hälfte");
    }
    public void gassi(){
        System.out.println("Sie geht regelmesig Gassi");
    }
    public void werBinIch(){

        System.out.printf("Ich bin eine Mitbewohnerin %s, Alter: %d, mein Heimat ist: %s\n", name, alter, heimat);
    }
}
