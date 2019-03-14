package aplicatiiTR;

public class TR10 {

	public static int marginsAverage(int[] arr) {
		
		if (arr.length == 0) {
			return -1;
			
		}
		else {
			return (arr[0] + arr [arr.length - 1]) / 2;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(marginsAverage(new int[] {}));
		
	}
}
