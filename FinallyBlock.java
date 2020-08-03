package Exception;

public class FinallyBlock {
	public static void main(String[] args) {
		int a=10,b=0,res=0;
		int arr[]= {2,6,3,4};
		try {
			res=a/b;
			System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println("Number can not be divisible by 0");   //-->both exception already write separate program
		}
		finally {
			System.out.println("I am INDIAN");
		}
	}
}
//-->finally block always run exception came or not it not matter
//-->try with finally it also work 
