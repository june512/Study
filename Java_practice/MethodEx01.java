package method;

public class MethodTest {
	
	public static void main(String[] args) {		
		int a= 12;
		int result = sum(a, 15);		
		System.out.println("result : " + result);
	
		sumPrint(a, 15);
		
		//메소드명 multi, 정수값 3개를 받아서 3개 값을
		//곱한 결과값을 리턴하는 메소드
		int result2 = multi(5, 2, 3);
		System.out.println("result2 : " + result2);
		
	}
	
	public static int multi(int n1, int n2, int n3) {
		return n1 * n2 * n3;
	}

	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public static void sumPrint(int n1, int n2) {
		System.out.println("result : " + (n1 + n2));
		
	}
}
