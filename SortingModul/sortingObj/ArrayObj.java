public class ArrayObj {

  private Person [] persones;
  private int nElm;

  public ArrayObj(int max){
    persones = new Person[max]; // new array has Person
    nElm = 0;
  }

  public void add(String last, String first, int age){
    persones[nElm] = new Person(last, first, age);
    nElm ++ ;
  }

  public void display(){
    for(int j=0; j<nElm; j++) persones[j].displayPerson(); // for each element,
    System.out.println(""); // display it
  }


  public void insertionSort(){
    int i,j;
    for(i = 1; i < nElm; i++){
      Person temp = persones[i];
      j = i -1;
      while(j > 0 && persones[j].getLast().compareTo(temp.getLast()) > 0){
        persones[j+1] = persones[j];
        j --;
      }
      persones[j+1] = temp;
    }
  }
}