public class Aufgabe9 {
    public static int[] sumUpInt(int[] a){
        if(a==null){
            System.err.println("wrong.aufgabe9.sumUpInt.input.1");
            return null;
        }
        int counter=0;
        int[] fix=new int[a.length];
        for(int i=0; i< a.length; i++){
            counter+=a[i];
            fix[i] = counter;
        }
        return fix;
    }
}
