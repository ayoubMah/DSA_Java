public class HighArray {
  private int [] arr;
  private int nElm;

  public HighArray(int max){
    arr = new int[max];
    nElm = 0;
  }

  public void insert(int elm){
    arr[nElm] = elm;
    nElm ++;
  }

  public boolean find(int target){
    int j ;
    for(j = 0; j < nElm ; j++){
      if(arr[j] == target) break;
    }
    if(j == nElm) return false;
    else return true;
  }

  // find method with binary search
  // so we suppose that the array is already sorted
  public boolean findBin(int target){
    int lowIndex = 0;
    int highIndex = nElm - 1 ;
    while(highIndex > lowIndex){
      int mid = lowIndex + (highIndex - lowIndex)/2 ;
      if(target == arr[mid]) return true;
      else if(target > arr[mid]){
        lowIndex = mid + 1;
      }else{
        highIndex = mid;
      }
    }
    return false;
  }



  public boolean delete(int elm){
    int j;
    for(j = 0; j < nElm; j++){
      if(elm == arr[j]) break;
    }
    if(j == nElm) return false;
    else {
      for(int k = j; k < nElm - 1 ; k++){
        arr[k] = arr[k+1];
      }
      nElm --; // reduce the size of the array by one
      return true;
    }
  }

  public void display(){
    int j ;
    for(j = 0; j < nElm; j++){
      System.out.print(arr[j] + "  ");
    }
    System.out.println(" ");
  }

  public int size(){
    return nElm;
  }

  public int getMax(){
    if(nElm == 0) return -1;
    else {
      int j = 0;
      int max = arr[0];
      for(j =0; j < nElm ;j++){
        if(arr[j] > max){
          max = arr[j];
        }
      }
      return max;
    }
  }
}