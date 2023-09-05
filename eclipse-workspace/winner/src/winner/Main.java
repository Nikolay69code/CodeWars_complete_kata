package winner;

public class Main {
	public static int bigLettersCount(String text) {
        var result = 0;

        for (var i = 0; i < text.length(); i++) {
            var current = text.charAt(i);
            if (Character.toUpperCase(current) == current) {
                result += 1;
            }
        }

        return result;
    }
	public static boolean greaterThan(String firstWord, String secondWord) {
        if (Main.bigLettersCount(firstWord) > Main.bigLettersCount(secondWord)){
            return true;
        }
        else{
            return false;
        }
	}
	public static void main(String[] args) {
		System.out.print(greaterThan("AAAA","AAA"));
	}

}
