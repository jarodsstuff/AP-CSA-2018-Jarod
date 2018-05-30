
public class Phonetics {
	private String originalWord;
	private String simplifiedWord;
	
	public Phonetics(String ow) {
		originalWord = ow.toUpperCase();
	}
	public String simplify() {
		String simple = firstLetters(originalWord);
		return simple;
	}
	private String firstLetters(String word) {
		String newWord = "";
		if (word.substring(0, 3).equals("MAC")) {
			newWord += "MC";
			
		} else if (word.substring(0, 2).equals("KN")) {
			newWord += "N";
		} else if (word.substring(0, 1).equals("K")) {
			newWord += "C";
		} else if ((word.substring(0, 2).equals("PH")) || (word.substring(0, 2).equals("PF"))) {
			newWord += "F";
		} else if (word.substring(0, 3).equals("SCH")) {
			newWord += "S";
		} else {
			
		}
		return newWord;
	}
}
