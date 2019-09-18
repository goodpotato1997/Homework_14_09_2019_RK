
import java.util.Scanner;
public class Hw_Shareddig_13 {
    public static void main(String[]args){
        hasSharedDigit();

    }
    public static void hasSharedDigit(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();

            int lefta = a / 10;
            int righta = a % 10;
            int leftb = b / 10;
            int rightb = b % 10;
            if (a<10 || a>99 ||b<10 || b>99){
                System.out.println("False");
            }else if (lefta == leftb || lefta == rightb || righta == leftb
                    || righta == rightb){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }

    }
}
