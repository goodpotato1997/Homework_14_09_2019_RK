
import java.util.Scanner;
public class Hw_Pelindrome_5 {
    public static void main(String args[]) {

        System.out.print("Input a Number: ");
        ispelindrome();
    }
    public static void ispelindrome(){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0, reverse;
        int temp = number;
        while(number!=0)
        {
            reverse = number % 10;
            sum = (sum*10)+reverse;
            number = number/10;
        }
        if(temp==sum)
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("Is not a palindrome number");
    }

}