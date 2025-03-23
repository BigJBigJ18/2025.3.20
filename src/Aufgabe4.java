import java.util.Random;

public class Aufgabe4 {
    private final int[] noten;
    private int von;
    private int anzahl;

    public Aufgabe4(){
        noten=new int[16];

        for(int i=0; i <23; i++){
            noten[new Random(System.currentTimeMillis()+new Random().nextInt()).nextInt(0, 16)]++;
        }
    }

    public Aufgabe4(int von, int bis, int anzahl){
        if(anzahl < 0){
            System.err.println("wrong.aufgabe4.<<aufgabe4>>.input.1");
            anzahl=23;
        }
        if(von < 0){
            System.err.println("wrong.aufgabe4.<<aufgabe4>>.input.2");
            von=0;
        }
        if(bis < 0){
            System.err.println("wrong.aufgabe4.<<aufgabe4>>.input.3");
            bis=15;
        }

        this.von=von;
        this.anzahl=anzahl;
        noten=new int[bis-von+1];

        for(int i=0; i <anzahl; i++){
            noten[new Random(System.currentTimeMillis()+new Random().nextInt()).nextInt(von-1, bis)]++;
        }
    }


    public void ausgabe(){
        System.out.println("         Ausgabe\n" +
                "-----------------------");
        for(int i=0; i < noten.length; i++){
            System.out.print("Note "+(von+i)+": ");
            for(int j=1000000; j>1; j/=10) if(i<j) System.out.print(" ");
            System.out.println("|      "+noten[i]+"x");
        }

    }

    public int besteNote(){
        int beste=noten[0];
        for(int i=0; i<noten.length; i++){
            if(noten[i]>0){
                beste=von+i;
                break;
            }
        }
        return beste;
    }

    public int schlechtesteNote(){
        int schlechteste=noten[0];
        for(int i=noten.length-1; i>0; i--){
            if(noten[i]>0){
                schlechteste=von+i;
                break;
            }
        }
        return schlechteste;
    }

    public float mittelwert(){
        int counter=0;
        for(int i=0; i<noten.length; i++){
            counter+=(von+i)*noten[i];
        }
        return (float)counter/anzahl;
    }
}
