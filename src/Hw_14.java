import java.util.Arrays;
public class Hw_14 {
    public static void main(String[] args){

        int[] number = {345,4796,566,123,9575,456,278,4589};

        String[] name = {"Ramesh","Gopal","Smit","Nilesh","Gaurav","Gurmit"};
        Arrays.sort(number);
        System.out.println("Sorted numeric array : "+Arrays.toString(number));

        Arrays.sort(name);
        System.out.println("Sorted string array : "+Arrays.toString(name));
    }
}
