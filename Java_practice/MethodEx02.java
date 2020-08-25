package method;

public class MethodTest2 {

	public static void main(String[] args) {
		int result = whoIsBig(10, 350, 11, 200, 100, 110, 120);
		
		System.out.println("result : " + result);
	}
	
	public static int whoIsBig(int a, int b, int c, int d, int e, int f, int g) {
		int[] arr = {a, b, c, d, e, f, g};
		int big = arr[0];
		for(int val : arr) {
			if(big < val) {
				big = val;
			}
		}
		return big;
	}
	

}
