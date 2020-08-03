package Exception;

public class NastedTryCatch {
	public static void main(String[] args) {
		int a=10,b=3,res=0;
		int arr[]= {2,6,3,4};
		try {
			res=a/b;
			System.out.println(res);
			try {
				System.out.println(arr[res]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Index not found");
			}
		}catch(ArithmeticException e) {
			System.out.println("Number can not be divisible by 0");   //-->both exception already write separate program
		}
		
	}
}
   //-->in the above program depends on denominator(b variable change as you want) when give 0 then return Number can not be divisible by 0 and
		//   when we give any number like 3 then it give 4 output that is 3rd position in index
		// 10/3=3 that,s why the output is 4