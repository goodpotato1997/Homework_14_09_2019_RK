public class Hw_15 {
    public static void main(String[] args) {
        int sum = 0;
        int[] number = {15, 28, 31, 46, 59};
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }
        System.out.println("Array Sum="+sum);
    }
}