import java.util.Scanner;
public class Hw_DigitSumChallenge_4 {
    public static void main(String[] args) {
        int number=0;
        if(number<0){
            System.out.println("-1");
        }
        sumDigits();
    }
    public static void sumDigits(){
        Scanner in = new Scanner(System.in);
        int sum =0;
        System.out.print("Enter the number :");
        int number = in.nextInt();
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
