package aplicatiiEA;

public class TestEA21 {
	public static String hangman(String word, String letters) {
		String returnString = "";
		for (int i = 0; i < word.toCharArray().length; i++) {
			if (word.charAt(i) == ' ') {
				returnString += " ";
				continue;
			}
			if (!(word.matches("^[a-z A-Z]*$"))) {
				return null;
			}
			boolean check = false;
			for (char elementDinLetters : letters.toLowerCase().toCharArray()) {
				if (word.toLowerCase().charAt(i) == elementDinLetters) {
					returnString += word.charAt(i);
					check = true;
				}
			}

			if (check == false) {
				returnString += "_";
			}
		}
		return returnString;
	}

	public static void main(String[] args) {
		System.out.println(hangman("Java is BAD", "bad"));
		System.out.println(hangman("coll,ections", "eio"));
		System.out.println(hangman("abc", ""));
		System.out.println(hangman("", "abc"));
	}
}
