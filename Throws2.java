package Exception;

class MyException extends Exception{
	
}

class Student2{
	private int age;
	public void setAge(int a) throws MyException {
		if(a<=0)
		{
			throw new MyException();
		}
		else
		{
			age=a;
		}
	}
	public int getAge() {
		return age;
	}
}

public class Throws2 {
	public static void main(String[] args) {
		Student2 s1=new Student2();
		try {
		s1.setAge(10);                               
		System.out.println("Age :"+s1.getAge());
		}catch(MyException ex) {
			System.out.println("Invalid age");
		}
	}
} 

//->throws keyword used to indicate that this method/constructor could throw the exception