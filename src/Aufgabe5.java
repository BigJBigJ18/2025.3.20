import java.util.Random;

import static java.util.Arrays.sort;

public class Aufgabe5 {
    private final int[] feld1;
    private final int[] feld2;
    private final int[] feld3;

    public Aufgabe5(){
        feld1=new int[20];
        feld2=new int[20];
        feld3=new int[20];

        instanziierung();
    }

    public Aufgabe5(int laenge){
        feld1=new int[laenge];
        feld2=new int[laenge];
        feld3=new int[laenge];

        instanziierung();
    }


    private void instanziierung(){
        for(int i=0; i<feld1.length; i++){
            feld1[i]=new Random(System.currentTimeMillis()+new Random().nextInt()).nextInt(-1000, 1000);
            if(feld1[i]%2!=0) i--;
        }

        for(int i=0; i<feld2.length; i++){
            feld2[i]=new Random(System.currentTimeMillis()+new Random().nextInt()).nextInt(-1000, 1000);
            feld3[i]=new Random(System.currentTimeMillis()+new Random().nextInt()).nextInt(-1000, 1000);
        }
        sort(feld2);
        sort(feld3);
        umdrehen(feld3);
    }

    private void umdrehen(int[] array){
        for(int i=0; i<array.length/2; i++){
            int tausch=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=tausch;
        }
    }

    public void ausgabe(){
        for(int i=1; i<=3; i++){
            System.out.println("∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨");
            System.out.println("       Feld "+i
                           +"\n---------------------");

            switch (i){
                case 1:
                    for(int k=0; k<feld1.length; k++){
                        System.out.print(k);
                        for(int j=1000000; j>1; j/=10) if(k<j) System.out.print(" ");
                        System.out.println("|      "+feld1[k]);
                    }
                    break;

                case 2:
                    for(int k=0; k<feld2.length; k++){
                        System.out.print(k);
                        for(int j=1000000; j>1; j/=10) if(k<j) System.out.print(" ");
                        System.out.println("|      "+feld2[k]);
                    }
                    break;

                case 3:
                    for(int k=0; k<feld3.length; k++){
                        System.out.print(k);
                        for(int j=1000000; j>1; j/=10) if(k<j) System.out.print(" ");
                        System.out.println("|      "+feld3[k]);
                    }
                    break;
            }
        }
    }
}
