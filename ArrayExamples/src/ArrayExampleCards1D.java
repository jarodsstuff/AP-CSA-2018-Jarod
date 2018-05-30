
public class ArrayExampleCards1D {

	public static void main(String[] args) {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

		int i = (int) (Math.random() * ranks.length);
		int j = (int) (Math.random() * suits.length);
		
		System.out.println(ranks[i] + " of " + suits [j]);
	}

}
