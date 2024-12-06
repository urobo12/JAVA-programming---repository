package ch13;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
	try {	
			int result = data.length();
			System.out.println("문자수 : " + result);
		} catch(NullPointerException e) {
			//e.getMessage()	<- 예외가 발생한 이유만 리턴
			//e.toString()		<- 예외의 종루만 히턴
			e.printStackTrace();//	<-예외가 어디서 발생했는지 추적한 내용도 출력
		} finally {
			System.out.println("[마무리 실행]\n");
		}
	}
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료");


	}

}
