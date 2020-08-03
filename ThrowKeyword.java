package Exception;

class Student{
	private int age;
	public void setAge(int a) {
		if(a<=0)
		{
			throw new ArithmeticException("Invalid Age");
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

public class ThrowKeyword {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setAge(-10);                               
		System.out.println("Age :"+s1.getAge());
	}
}
//--> A keyword throw the exception manually
//--> when age 0 and less than 0 then throw the exception
//-> we throw exception as you want but we throw ArithmeticException