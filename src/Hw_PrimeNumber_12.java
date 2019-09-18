import java.util.Scanner;

public class Hw_PrimeNumber_12 {
    public static void main(String[] args) {
        int num;
        System.out.print("Input the Number:");
        Scanner in= new Scanner(System.in);
        num =in.nextInt();
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
