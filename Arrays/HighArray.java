public class HighArray {
  private int [] arr;
  private int nElm;

  public HighArray(int max){
    arr = new int[max];
    nElm = 0;
  }

  public boolean find(int target){
    int j ;
    for(j = 0; j < nElm ; j++){
      if(arr[j] == target) break;
    }
    if(j == nElm) return false;
    else return true;
  }

  public void insert(int elm){
    arr[nElm] = elm;
    nElm ++;
  }

  public boolean delete(int elm){
    int j;
    for(j = 0; j < nElm; j++){
      if(elm == arr[j]) break;
    }
    if(arr[j] == nElm) return false;
    else {
      for(int k = j; k < nElm - 1 ; k++){
        arr[k] = arr[k+1];
      }
      nElm --;
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
}