package nov_13;

import java.util.*;

// Code: github.com/mtstnt/Tutorial-KA-2021

public class Iteration1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {

			String input = s.next();

			if (input.equals("Tidak")) {
				break;
			}

			try {
				int n = Integer.parseInt(input);

				for (int i = 0; i < n; i++) {
					// Deret kiri
					for (int j = 1; j <= n - i; j++) {
						System.out.print(j);
					}

					// Spasi
					for (int j = 0; j < i * 2; j++) {
						System.out.print(" ");
					}

					// Deret kanan
					for (int j = 1; j <= n - i; j++) {
						System.out.print(j);
					}

					// Deret menurun (uncomment)
					// for (int j = n - i; j >= 1; j--) {
					// 	System.out.print(j);
					// }

					System.out.println();
				}

				for (int i = n - 2; i >= 0; i--) {
					// Deret kiri
					for (int j = 1; j <= n - i; j++) {
						System.out.print(j);
					}

					// Spasi
					for (int j = 0; j < i * 2; j++) {
						System.out.print(" ");
					}

					// Deret kanan
					for (int j = 1; j <= n - i; j++) {
						System.out.print(j);
					}

					System.out.println();
				}

			} catch (NumberFormatException e) {
				System.out.println("Harus Integer! Error: " + e.getMessage());
			}
		}

		s.close();
	}
}
