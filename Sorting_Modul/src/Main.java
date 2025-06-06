import java.util.Arrays;

public class Main {

    public static int smallIndex (int [] arr , int start){
        int smallest = arr[start];
        int smallestIndex = start;
        for (int i = start ; i < arr.length ; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }



    public static int[] sortedArr(int[] arr){
        int len = arr.length;

        for (int i = 0 ; i < len ; i++){
            int small = smallIndex(arr , i);
            int elem = arr[i];
            arr[i] = arr[small];
            arr[small] = elem;


        }

        return arr ;
    }


    public static void main(String[] args) {
        int[] arr = {101, 23, 40, 45, 40, 22, 5, 55};
        System.out.println(Arrays.toString(arr));
//        int result = smallIndex(arr);
//        System.out.println(result);
//        int elem = arr[0];
//        arr[0] = arr[result];
//        arr[result] = elem;
//        System.out.println(Arrays.toString(arr));
        int[] arrr = sortedArr(arr);
        System.out.println(Arrays.toString(arrr));

    }
}