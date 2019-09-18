import java.util.Scanner;
public class Hw_EvendigitSum_11 {
    public static void main(String args[]) {

        int n, r, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        n = sc.nextInt();


        while (n > 0) {
            r = n % 10;
            if (r % 2 == 0) {
                s = s + r;
            }
            n = n / 10;
        }
        if (n<0){
            System.out.print("Sum of Even Digit=-1");
        }
        else

        System.out.print("\nSum of Even Digits :" + s);

    }


}
