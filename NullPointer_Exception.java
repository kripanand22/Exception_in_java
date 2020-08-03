package Exception;

class A{
	int h=10;
	void boy(){
		System.out.println("eating..");
	}
}

public class NullPointer_Exception {
	public static void main(String[] args) {
		System.out.println("hello");
		try {
		A a=null;                //-->A a=new A() when write this line then it run well intend of giving error       
		a.boy();
		System.out.println(a.h);
		}catch(NullPointerException ex) {
			System.out.println("Exception occure");
		}
		System.out.println("hii");
	}
}
