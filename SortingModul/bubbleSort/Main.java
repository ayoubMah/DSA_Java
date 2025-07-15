public class Main{
	public static void main(String []args){
		System.out.println("hi");
		ArrayBub arr = new ArrayBub(100);

		arr.add(3);
		arr.add(2);
		arr.add(34);
		arr.add(6);
		arr.add(77);
		arr.add(1);
		arr.add(9);
		arr.add(13);

		System.out.println("Array before sorting");
		arr.display();

		System.out.println("Array After sorting");
		arr.bubbleSort();
		arr.display();


	}

}
