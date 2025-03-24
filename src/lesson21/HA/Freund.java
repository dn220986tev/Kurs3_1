package lesson21.HA;

public class Freund {
    String name;
    String heimat;
    int alter;

    public Freund(){

    }
    public Freund(String freundNahme){
        name =freundNahme;
    }

    public Freund(String freundNahme, String heimat){
        name = freundNahme;
        this.heimat= heimat;
    }

    public Freund(String name, String heimat, int alter){
        this(name, heimat);
        this.alter = alter;
    }

    public void essen(){
        System.out.println("Wir gehen gerne in Restaurants essen");
    }
    public void kommunikazion(){
        System.out.println("Wir schreiben uns oft");
    }
    public void treffen(){
        System.out.println("Wir treffen uns drei Mal pro Woche");
    }
    public void werBinIch(){

        System.out.printf("Ich bin %s, Alter: %d, mein Heimat ist: %s\n", name, alter, heimat);
    }
}
