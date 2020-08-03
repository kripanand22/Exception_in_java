package Exception;

public class ArithmaticException {
	public static void main(String[] args) {
		int a=10,b=0,res=0;            //-->exception occur when b will be 0 otherwise it not give any exception
		System.out.println("hello");
		try {
		res=a/b;
		System.out.println("Division :"+res);
		}catch(ArithmeticException ex) {
			System.out.println("exception occure");
		}
		System.out.println("Hii");
	}

}
