import java.util.*;

public class Boolean2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int jam = scanner.nextInt();

		if (jam >= 1 && jam <= 8) {
			System.out.println("Anjingku sdh bangun");
		} else {
			System.out.println("Anjingku masih tidur");
		}

		scanner.close();
	}
}
