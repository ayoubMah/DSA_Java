
public class Main {
  public static void main(String[] args){
    ArrayObj arr = new ArrayObj(100);
    arr.add("ayoub", "mah", 10);
    arr.add("lyoub", "mah", 19);
    arr.add("wyoub", "mah", 10);
    arr.add("fyoub", "mah", 10);
    arr.add("hyoub", "mah", 10);

    arr.display();

    arr.insertionSort();

    arr.display();

  }
}
