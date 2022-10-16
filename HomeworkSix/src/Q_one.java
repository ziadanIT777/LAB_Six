import java.util.Scanner;

public class Q_one {
    public static void main ( String[] args ) {
        Scanner in =new Scanner ( System.in );
        double benefit=0,balance=0;          // benefit= الفائده للحساب         balance=رصيد الحساب
        double years=1;                  // years = السنين
        System.out.println ("Enter The balance:");
         balance=in.nextDouble ();
        System.out.println ("Enter The Benefit:");
         benefit=in.nextDouble ();
         benefit=benefit/100;
        boolean flag = true;
        while ( balance <=1000000 ){
            balance+=balance*benefit;
            years++;
        }

        System.out.println ("the balance = "+balance );
        System.out.println ("the years = "+years );

    }
}
