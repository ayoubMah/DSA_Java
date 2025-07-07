import java.util.Arrays;

public class Main {

    // the function that i'll give the array and it'll give me the sum of this array
    // but with a recursive approach
    public static int sumRecursive(int[] arr){
        int sum = 0;
        if (arr.length == 0){
            return sum;
        } else if (arr.length == 1) {
            return arr[0];
        }
        for (int i = 1 ; i < arr.length ; i++){
            sum = sum + arr[0] + arr[i];
        }

        return 0;
    }


    public static void main(String[] args) {
        int[] arrr = {4};
        System.out.println(sumRecursive(arrr));
    }
}