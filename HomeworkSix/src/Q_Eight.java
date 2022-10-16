import java.util.Scanner;

public class Q_Eight {
    public static void main ( String[] args ) {
        Scanner in =new Scanner ( System.in );
        System.out.println ("Enter The number ::");
        int number=in.nextInt ();
        for (int i = 1; i <= number ; i++){int  coun =0;
           for (int j = 1 ; j <= i; j++) {if (i % j == 0) coun++; }
           if (coun == 2)
               System.out.println (i);
        }
    }
}
