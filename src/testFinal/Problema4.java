package testFinal;

public class Problema4 {
	public static void combinations(String s, int n) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String before = s.substring(0, i);
			String after = s.substring(i + 1, n);
			combinations("" + before + after, n);
		}
	}

	public static void main(String[] args) {
		combinations("abc", 2);
	}
}
