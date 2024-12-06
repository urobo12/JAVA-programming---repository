package ch13;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
	try {	
			int result = data.length();
			System.out.println("���ڼ� : " + result);
		} catch(NullPointerException e) {
			//e.getMessage()	<- ���ܰ� �߻��� ������ ����
			//e.toString()		<- ������ ���縸 ����
			e.printStackTrace();//	<-���ܰ� ��� �߻��ߴ��� ������ ���뵵 ���
		} finally {
			System.out.println("[������ ����]\n");
		}
	}
	public static void main(String[] args) {
		System.out.println("[���α׷� ����]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[���α׷� ����");


	}

}
