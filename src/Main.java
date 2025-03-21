//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main.aufgabe1(false);

    }

    public static void aufgabe1(boolean manuell){
        int[] zahlen={10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        Aufgabe1 aufgabe1;

        if(manuell) {
            aufgabe1=new Aufgabe1();
        }else{
            aufgabe1 = new Aufgabe1(zahlen, true);
        }
        System.out.println("------------------------------Aufgabe 1------------------------------");
        System.out.println("Summe: "+aufgabe1.summe());
        System.out.println("Kleinste: "+aufgabe1.minimum());
        System.out.println("Größte: "+aufgabe1.maximum());
        System.out.println("Mittelwert: "+aufgabe1.mittelwert());
        System.out.println("Anzahl positiv: "+aufgabe1.anzPos());
        System.out.println("---------------------------------------------------------------------");
    }
}