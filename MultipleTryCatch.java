package Exception;

public class MultipleTryCatch {
	public static void main(String[] args) {
		int a=10,b=0,res=0;
		int arr[]= {2,6,3,4};
		try {
			res=a/b;
		}catch(ArithmeticException e) {
			System.out.println("Number can not be divisible by 0");   //-->both exception already write separate program
		}
		try {
			System.out.println(arr[11]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index not found");
		}
	}
}
