package Exception;

class MyException extends Exception{
	
}

class Student1{
	private int age;
	public void setAge(int a) {
		if(a<=0)
		{
			try {
			throw new MyException();
			}catch(MyException ex) {
				System.out.println("Invalid age");
			}
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

public class Throws {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.setAge(-10);                               
		System.out.println("Age :"+s1.getAge());
	}
}
//--> A keyword throw the exception manually
//--> when age 0 and less than 0 then throw the own exception but problem is age is always show 
//-> then we use throws keyword in next program