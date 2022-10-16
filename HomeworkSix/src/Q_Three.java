import java.util.Scanner;

public class Q_Three {
    public static void main ( String[] args ) {
        Scanner in =new Scanner ( System.in );
        System.out.println ("Enter The Word The Data Tyb String");
         String Word= in.next ();
        for (int i =0; i<Word.length () ; i++){
            System.out.println (Word.charAt (i));
        }
    }
}
