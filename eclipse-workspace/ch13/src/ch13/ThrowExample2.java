package ch13;

public class ThrowExample2 {

	public static void main(String[] args) {
	try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("���� ó��: " + e.toString());
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}

}
