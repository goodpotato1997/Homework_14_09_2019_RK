import java.util.Scanner;
public class Hw_MinAndMaxInputChallenge_2 {
    public static void main(String []args){
        int num =0 ;
        int min =0;
        int max =0;
        System.out.println("Enter the number :");
        Scanner scr = new Scanner(System.in);
        num = scr.nextInt();
        max = num;
        min = num;
        while (num>=0){
            if(num<min){
                min = num;
            }else if(num>max){
                max = num;
            }
            System.out.println("Enter the number :");
            num =scr.nextInt();
        }
        System.out.println("Minium number is :"+min+"and maxium number is :"+ max);
    }
}
