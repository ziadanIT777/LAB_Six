import java.util.Scanner;

public class Q_Saven {
    public static void main ( String[] args ) {
        Scanner in=new Scanner ( System .in);
        System.out.println ("Enter the numbers :");
        int num =in.nextInt ();
        for (;;){
            if (num==0)break;
            int sum=(num%2!=0)?1:0;
            num/=2;
            System.out.println ("The binary number is : "+sum);
        }
    }
}
