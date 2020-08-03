package Exception;

public class ArrayIndexoutOfBond_Exception {
	public static void main(String[] args) {
		int arr[]= {4,5,6,1}; 
		System.out.println("hello");
		try {
		System.out.println(arr[11]);                        //-->number put only less than the size of area otherwise it gives exception
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("you search out of area");
		}
		System.out.println("hii");
	}
}
