package Exception;

class Abc{
	void apple() {
		System.out.println("eating..");
	}
}
class B extends Abc{
	void game() {
		System.out.println("playing");
	}
}

class ClassCastException1 {
	public static void main(String[] args) {
		Abc a = new Abc();
		try {
		B b=(B)a;
		}catch(ClassCastException ex) {
			System.out.println("Class cast exception");
		}
	}
}
