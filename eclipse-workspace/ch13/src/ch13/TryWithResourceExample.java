package ch13;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try(MyResource res = new MyResource("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("���� ó��: " + e.getMessage());
		}
		
		System.out.println();
		
		try(MyResource res = new MyResource("A")) {
			String data = res.read2();
			
			int calue = Integer.parseInt(data);
		} catch (Exception e) {
			System.out.println("���� ó��: " + e.getMessage());
		}
		
		System.out.println();
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");
		try (res1; res2) {
			String data1 = res1.read1();
			String data2 = res1.read2();
		} catch (Exception e) {
			System.out.println("����ó��: " + e.getMessage());
		}
	}

}
