import java.util.Random;

public class Election {
	public static void main(String[] args) {
		Random ran = new Random();
		if (ran.nextBoolean() == true) {
			System.out.println("Biden wins :)");
		} else {
			System.out.println("Trump wins :(");
		}
	}
}
