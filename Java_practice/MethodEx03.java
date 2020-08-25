package method;

public class MethodTest3 {

	public static void main(String[] args) {
		int result = whoIsBig(10, 350, 11, 200, 100);
		System.out.println("result : " + result);
		
		result = whoIsBig(10, 20, 30);
		System.out.println("result : " + result);
		
		result = whoIsBig(10, 20, 30, 40);
		System.out.println("result : " + result);
	}
	public static int whoIsBig(int a, int b, int c) {
		int[] arr = {a, b, c};
		int result = proc(arr);
		return result;
	}
	
	public static int whoIsBig(int a, int b, int c, int d) {
		int[] arr = {a, b, c, d};
		return proc(arr);
	}
	
	public static int whoIsBig(int a, int b, int c, int d, int e) {		
		return proc(new int[] {a, b, c, d, e}) ;
	}
	
	public static int proc(int[] arr) {		
		int big = arr[0];
		for(int val : arr) {
			if(big < val) {
				big = val;
			}
		}
		return big;
	}

}

