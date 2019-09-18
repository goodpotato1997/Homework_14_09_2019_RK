import java.util.Scanner;
public class Hw_FL_Sum_7 {
    public static void main(String[] args) {
        sumFirstAndLast();
    }
    public static int sumFirstAndLast(){
        System.out.print("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int num, number;
        num = sc.nextInt();
        number =sc.nextInt();

        if(num < 0){
            return -1;
        }
        int lastDigit = num % 10;

        while(num >= 10){
            num = number / 10;
        }
        int firstDigit = num ;
        return firstDigit + lastDigit;
    }
}
