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

    //now i'll the same thing but i'll sorting the array descending

    public static int biggest(int start , int[] arr){

        int bigOne = arr[start];
        int bigIndex = start;
        for (int i = start + 1 ; i < arr.length ; i++){
            if (arr[i] > bigOne){
                bigOne = arr[i];
                bigIndex = i;
            }
        }
        return bigIndex;
    }

    public static int[] sortingDes(int[] array){
//        int bigIndexElm = biggest(0 , array);
//        int bigElm = array[bigIndexElm];
//        array[0] = bigElm;
//        array[bigIndexElm] = array[0];
        int len = array.length;
        for (int i = 0; i < len ; i++){// 0    1
            int bigIndexx = biggest(i , array);// 0   7
            int currentElm = array[i];
            array[i] = array[bigIndexx];// 0 --> 101  1 --> 55
            array[bigIndexx] = currentElm;
        }
        return array;
    }



    public static void main(String[] args) {
        int[] arr = {101, 23, 40, 45, 40, 22, 5, 55};
        int[] arr2 = {101, 23, 40, 45, 200, 22, 5, 55};
        System.out.println(Arrays.toString(arr));
//        int result = smallIndex(arr);
//        System.out.println(result);
//        int elem = arr[0];
//        arr[0] = arr[result];
//        arr[result] = elem;
//        System.out.println(Arrays.toString(arr));
        int[] arrr = sortedArr(arr);
        int[] arr22 = sortingDes(arr2);
        System.out.println(Arrays.toString(arrr));
        System.out.println(Arrays.toString(arr22));
        //System.out.println(biggest(4,arr2));

    }
}