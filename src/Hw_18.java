import java.util.Scanner;
public class Hw_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int Num = input.nextInt();

        int[] value = { 1, 12, 3, 60, 5, 6, 20, 8, 35, 10 };

        int i = 0;

        for (i = 0; i < value.length; i++) {
            if (value[i] == Num) {
                System.out.print("\nYes, "+Num+" is in this array.");
                break;
            }
        } if ((value.length) - i == 0) {
            System.out.print("\nNo, "+Num+" is not in this array.");
        }
    }
}
