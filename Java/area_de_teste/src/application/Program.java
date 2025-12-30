package application;

public class Program {

	public static void main(String[] args) {
		
		System.out.println(removeNonDigits("94923784799"));
		System.out.println(removeNonDigits("213.445.034-82"));
		System.out.println(removeNonDigits("213 445 034 82"));
	
	}
	public static String removeNonDigits(String input) {
		return input.replaceAll("\\D", "");
	}
}
