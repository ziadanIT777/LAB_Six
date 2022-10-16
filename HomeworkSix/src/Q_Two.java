import java.util.Scanner;

public class Q_Two {
    public static void main ( String[] args ) {
        Scanner in=new Scanner ( System.in );
       // :- A
       /*

        int count=2,sum = 0;
        while (count<=100){
            if (count%2==0)
                sum=sum+count;
            else
                count+=2;
        }
        System.out.println ("The sum even = "+sum);

        */
        //****************************************
       // :- B


        int a,b;
        System.out.println ("enter the A");
        a=in.nextInt ();
        System.out.println ("enter the B");
        b=in.nextInt ();
        int max,min;
        if (a>b||a==b)    max = a;   else    max = b;

        if (a>b||a==b)   min = b;   else    min = a;

        int  sum=0 ;
            for (int  i = min ; i<=max ; i+=2){sum+=i;}
        System.out.println ("The sum  odd is ="+sum);

         //**************************************************

        //:-c

        /*
         int[] arr =new int[9];
        System.out.println ("enter The number");
        int sum=0;
        arr[9]=in.nextInt();
        for ( int  i=0; i<arr.length;i++){
            if (arr[i]%2!=0)
                sum=sum+i;
            else System.out.println ("not numbers of odd");
        }
        System.out.println ("The sum is="+sum);
        */

        //****************************************

    }
}
