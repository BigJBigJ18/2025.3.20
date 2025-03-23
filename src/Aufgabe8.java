public class Aufgabe8 {
    public static int[] delElement(int[] a, int w){
        if(a==null) {
            System.err.println("wrong.aufgabe8.delElement.input.null");
            return null;
        }

        int entfernte =0;
        for(int i=0; i<a.length; i++){
            if(a[i]==w){
                entfernte++;
                for(int j=i; j<a.length; j++){
                    if(!(j+1>=a.length)){
                        a[j]=a[j+1];
                    }else{
                        a[j]='▓';
                    }
                }
                i--;
            }
        }

        int[] fix=new int[a.length-entfernte];
        System.arraycopy(a, 0, fix, 0, a.length-entfernte);
        return fix;
    }
}
