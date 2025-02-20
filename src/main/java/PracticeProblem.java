public class PracticeProblem {

	public static String pyramid(int rows) {
		String drawing = "";
		for (int i = rows - 1; i >= 0; --i) {
			drawing += " ".repeat(i) + '*';
			drawing += " *".repeat(rows - i - 1);
			if (i != 0) drawing += '\n';
		}
		return drawing;
	}

	public static String square(int length) {
		if (length < 0) return "";
		String drawing = "*".repeat(length); // first row
		if (length > 1) {
			for (int i = 0; i < length - 2; ++i) drawing += "\n*" + " ".repeat(length - 2) + '*';
			drawing += '\n' + "*".repeat(length);
		}
		return drawing;
	}

	public static boolean hasLowercase(String word) {
		for (int i = 0; i < word.length(); ++i) {
			if (Character.isLowerCase(word.charAt(i))) return true;
		}
		return false;
	}

}
