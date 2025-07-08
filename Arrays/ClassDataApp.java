public class ClassDataApp {
  public static void main(String[] args){

    int maxSize = 100; // array size
    ClassDataArray arr;
    arr = new ClassDataArray(maxSize);

    arr.put("Evans", "Patty", 24);
    arr.put("Smith", "Lorraine", 37);
    arr.put("Yee", "Tom", 43);
    arr.put("Adams", "Henry", 63);
    arr.put("Hashimoto", "Sato", 21);
    arr.put("Stimson", "Henry", 29);
    arr.put("Velasquez", "Jose", 72);
    arr.put("Lamarque", "Henry", 54);
    arr.put("Vang", "Minh", 22);
    arr.put("Creswell", "Lucinda", 18);

    arr.displayA();

    // you can try all other methodes

  }
}