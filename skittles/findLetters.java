public class findLetters {
	public static String findLetters(String in) {
		String[] lookfor = {"R","O","Y","G","P"};
		String out = "";
		for(String check : lookfor) {
			if (in.contains(check)) {
				out += check;
			}
		}
		return out;
	}
	public static void main(String[] args) {
		System.out.println(findLetters("ROYGP"));
	}
}
