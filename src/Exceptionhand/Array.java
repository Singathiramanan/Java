package Exceptionhand;

public class Array {

	public static void main(String[] args) {
		System.out.println("-----Main Starts----");
		try{	
		 	int[] arr={43,78,69,40,32};
			System.out.println(arr[8]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Handled");
		}
		System.out.println("-----Main Ends----");
	}

}
