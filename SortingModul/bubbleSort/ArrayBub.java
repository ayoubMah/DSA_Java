public class ArrayBub {
  private int [] arr;
  private int nElm;

  public ArrayBub(int max){
    arr = new int[max];
    nElm = 0;
  }

  // add an elm
  public void add(int elm){
      arr[nElm] = elm;
      nElm ++;
  }

  // display
  public void display(){
    int j;
    for(j = 0; j < nElm; j++){
      System.out.print(arr[j]);
      System.out.print("  ");
    }
    System.out.println();
  }

  // bubble sort
  public void bubbleSort(){
    int i, j;
    for(i = nElm - 1; i > 1; i -- ){
      for(j = 0; j < i; j++){
        if(arr[j] > arr[j+1]){
          swap(j,j+1);
        }
      }
    }
  }

  // swap elm
  public void swap(int first, int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }

}
