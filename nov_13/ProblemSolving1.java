package nov_13;
import java.util.*;

public class ProblemSolving1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			// Segitiga spasi
			for (int j = 0; j < (n - i) * 2 - 2; j++) {
				System.out.print(" ");
			}

			// Pola angka kiri
			int counter = i;
			for (int j = 0; j < i + 1; j++) {
				counter++;
				System.out.print(counter + " ");
			}

			for (int j = 0; j < i; j++) {
				counter--;
				System.out.print(counter + " ");
			}

			System.out.println();
		}

		s.close();
	}
}
