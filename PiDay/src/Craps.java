import java.util.Random;

public class Craps {

	public static void main(String[] args) {
		int d1 = rollDie();
		int d2 = rollDie();
		int sum = sum(d1, d2);
		
		System.out.println("Die 1\tDie 2\tSum");
		System.out.printf("%d" + "\t" + "%d" + "\t" + "%d", d1, d2, sum);
	}
	public static int rollDie() {
		Random rand = new Random();
		return (rand.nextInt(6) + 1);
	}
	public static int sum(int die1, int die2) {
		return die1 + die2;
	}

}
