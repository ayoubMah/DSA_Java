public class SortingArray {

    public int smallIndex (int [] arr){
        int smallest = arr[0];
        int smallestIndex = 0;
        for (int i = 1 ; i < arr.length ; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
