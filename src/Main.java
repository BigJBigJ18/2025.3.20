//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main.test();
    }

    public static void test(){
        Main.aufgabe1(false);
        Main.aufgabe2();
        Main.aufgabe3(false);
        Main.aufgabe4(true);
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

    public static void aufgabe2(){
        Aufgabe2 aufgabe2=new Aufgabe2(10);
        System.out.println("------------------------------Aufgabe 2------------------------------");
        System.out.print("Liste: "); aufgabe2.ausgabe(); System.out.println();
        System.out.println("∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨");
        System.out.println("Summe: "+aufgabe2.summe());
        System.out.println("Kleinste: "+aufgabe2.minimum());
        System.out.println("Größte: "+aufgabe2.maximum());
        System.out.println("Mittelwert: "+aufgabe2.mittelwert());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Anzahl Genau: "+aufgabe2.anzKorrekt());
        System.out.println("Anzahl Unter: "+aufgabe2.anzUnter());
        System.out.println("Anzahl Über: "+aufgabe2.anzUeber());
        System.out.println("∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨");
        System.out.println("Prozent Genau: "+aufgabe2.proKorrekt());
        System.out.println("Prozent Unter: "+aufgabe2.proUnter());
        System.out.println("Prozent Über: "+aufgabe2.proUeber());
        System.out.println("---------------------------------------------------------------------");
    }

    public static void aufgabe3(boolean manuell){
        Aufgabe3 aufgabe3;
        if(manuell){
            aufgabe3=new Aufgabe3(1, 5, 10);
        }else{
            aufgabe3=new Aufgabe3();
        }
        System.out.println("------------------------------Aufgabe 3------------------------------");
        aufgabe3.ausgabe();
        System.out.println("---------------------------------------------------------------------");
    }

    public static void aufgabe4(boolean manuell){
        Aufgabe4 aufgabe4;
        if(manuell){
            aufgabe4 =new Aufgabe4(1, 5, 32);
        }else{
            aufgabe4 =new Aufgabe4();
        }
        System.out.println("------------------------------Aufgabe 4------------------------------");
        aufgabe4.ausgabe();
        System.out.println("∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨");
        System.out.println("Beste Note: "+aufgabe4.besteNote());
        System.out.println("Schlechteste Note: "+aufgabe4.schlechtesteNote());
        System.out.println("Mittelwert: "+aufgabe4.mittelwert());
        System.out.println("---------------------------------------------------------------------");
    }
}