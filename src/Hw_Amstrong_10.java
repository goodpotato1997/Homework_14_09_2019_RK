import java.util.Scanner;
public class Hw_Amstrong_10 {
    public static void main(String[] args)  {

        int c=0,a,n;
        System.out.print("Input the Number:");
        Scanner in= new Scanner(System.in);
        n =in.nextInt();
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(n==c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}
