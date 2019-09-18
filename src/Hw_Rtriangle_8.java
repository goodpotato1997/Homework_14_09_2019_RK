
public class Hw_Rtriangle_8 {
    public static void main(String[] args) {
        int n, j, i;
        System.out.println("Input number of rows : ");
        n =5;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (j<=i)
                System.out.print("@");
            }
            System.out.println();

        }
    }
}



