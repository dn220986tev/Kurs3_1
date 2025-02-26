package lesson_21_HA;

public class Hundin {
    String name;
    String heimat;
    int alter;

    public Hundin(){

    }
    public Hundin(String hundinNahme){
        name =hundinNahme;
    }

    public Hundin(String hundinNahme, String heimat){
        name = hundinNahme;
        this.heimat= heimat;
    }

    public Hundin(String name, String heimat, int alter){
        this(name, heimat);
        this.alter = alter;
    }

    public void essen(){
        System.out.println("Meine Hundin  frisst zwei Mal pro Tag");
    }
    public void steuer(){
        System.out.println("Ich bezahle 90 Euro pro Jahr");
    }
    public void krankerkasse(){
        System.out.println("Es kostet 8.99 Euro pro Monat");
    }
    public void werBinIch(){

        System.out.printf("Ich bin eine Hundin %s, Alter: %d, mein Heimat ist: %s\n", name, alter, heimat);
    }

}
