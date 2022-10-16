import java.util.Scanner;

public class Q_Five {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );

        char hrwf_Alalh[] = new char[]{'a' , 'e' , 'i' , 'o' , 'u' , 'y'};
        System.out.println ( "Enter the word Typ string" );
        String word = in.next ();
        int sum = 0;
        for (int i = 0; i < word.length (); i++) {
            for (int j = 0; j < hrwf_Alalh.length; j++) {if (word.charAt ( i ) == hrwf_Alalh[j]) sum++;}}
        System.out.println ( "The sum = "+sum );
    }
}
