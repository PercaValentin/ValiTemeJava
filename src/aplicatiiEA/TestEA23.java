package aplicatiiEA;

public class TestEA23 {
	public static String camelCase(String input) {
		input = input.trim();
		String subString[] = input.split("[ ]");
		String returnString = "";
		if (input == "") {
			return "";
		}

		for (int i = 0; i < subString.length; i++) {
			if (i == 0) {
				returnString += subString[i].substring(0, 1).toLowerCase() + subString[i].substring(1).toLowerCase();
			} else {
				returnString += subString[i].substring(0, 1).toUpperCase() + subString[i].substring(1).toLowerCase();
			}
		}
		return returnString;
	}

	public static void main(String[] args) {
		System.out.println(camelCase("ana are mere"));
		System.out.println(camelCase(" ANA are MERE"));
		System.out.println(camelCase(""));
	}
}
