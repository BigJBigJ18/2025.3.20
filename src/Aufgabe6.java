public class Aufgabe6 {
    public int searchIndex(int[] a, int value){
        if(a==null){
            System.err.println("wrong.aufgabe6.searchIndex.input.1");
        }else{
            for(int i=0; i<a.length; i++)
                if(a[i]==value)
                    return i;
        }
        return -1;
    }
}
