public class Aufgabe7 {
    public int[] swap(int[] a, int i, int j){
        if(a==null){
            System.err.println("wrong.aufgabe7.swap.input.1");
            return null;
        }

        Aufgabe6 aufgabe6=new Aufgabe6();
        int pos1=aufgabe6.searchIndex(a, i);
        int pos2=aufgabe6.searchIndex(a, j);
        if(pos1<0||pos2<0){
            System.err.println("wrong.aufgabe7.swap.input.2");
            return null;
        }
        int tausch=a[pos1];
        a[pos1]=a[pos2];
        a[pos2]=tausch;
        return a;
    }

    public void ausgabe(int [] array){
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(!(i+1>=array.length)) System.out.print(", ");
        }
        System.out.println("]");
    }
}
