public class Arrays {
    public static void main(String[] args) {
        // Example usage of the Arrays class
        int[] numbers ;
        numbers = new int[100];
        int nElements = 0;

        int j;
        int searchKey ;

        numbers[0] = 77;
        numbers[1] = 99;
        numbers[2] = 44;
        numbers[3] = 55;
        numbers[4] = 22;
        numbers[5] = 88;
        numbers[6] = 11;
        numbers[7] = 45;
        numbers[8] = 66;
        numbers[9] = 33;

        nElements = 10;

        System.out.println("=========================================");

        // display items
        for(j = 0; j < nElements ; j++){
            System.out.println("item "+j+ " in the array is => " + numbers[j]);
        }

        System.out.println("=========================================");

        // find item with key= 66
        searchKey = 66;
        for(j = 0; j < nElements ; j++){
            if(numbers[j] == searchKey){
                break;
            }
        }
        if(j == nElements) System.out.println("we can't find elm !");
        else System.out.println("the inde of elm = "+searchKey+ " is " + j);

        // delete ele with key = 22

        int toDelete = 22;
        for(j = 0 ; j < nElements ; j++){
            if(numbers[j] == toDelete) break;
        }
        for(int k = j; k < nElements - 1; k++){
            numbers[k] = numbers[k + 1];
        }
        nElements --;
        // new array
        System.out.println("=========================================");
        System.out.println("the array without the elem ");
        for(j = 0; j < nElements; j++){

            System.out.println("item "+j+ " in the array is => " + numbers[j]);
        }


    }
}