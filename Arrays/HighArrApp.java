public class HighArrApp {
  public static void main(String []args){
    HighArray high = new HighArray(100);

    HighArray sor = new HighArray(100); // use it for binary search

    high.insert(3);
    high.insert(34);
    high.insert(65);
    high.insert(1001);
    high.insert(21);
    high.insert(56);
    high.insert(25);
    high.insert(17);
    high.insert(99);
    high.insert(43);
    high.insert(4);

    sor.insert(11);
    sor.insert(12);
    sor.insert(13);
    sor.insert(14);
    sor.insert(15);
    sor.insert(16);
    sor.insert(17);
    sor.insert(18);
    sor.insert(19);

    // display the elms of the arr
    high.display();
    // the size of the arr
    System.out.println("The size of the array is => "+ high.size());

    System.out.println("==================================");
    System.out.println("Array before delete 99");
    high.display();

    high.delete(99);
    System.out.println("==================================");
    System.out.println("Array After delete 99");
    high.display();

    System.out.println("==================================");
    System.out.println("is the elm 21 exist ? => "+ high.find(21));

    System.out.println("==================================");
    System.out.println("is the elm 11 exist using binary search ? => "+ sor.findBin(17));

    System.out.println("==================================");
    System.out.println("the max is => "+ high.getMax());

  }
}