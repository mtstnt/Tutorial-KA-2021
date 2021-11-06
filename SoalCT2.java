import java.util.*;

public class SoalCT2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// scanner.next(TIPE_DATA) -> nextInt, nextDouble
		// scanner.next() -> baca string sampai enter.
		int testcase = scanner.nextInt();

		for (int t = 0; t < testcase; t++) {

			int row = scanner.nextInt();
			int col = scanner.nextInt();
			int height = scanner.nextInt();
			int width = scanner.nextInt();

			for (int r = 0; r < row; r++) {
				for (int i = 0; i < height + 1; i++) {
					for (int c = 0; c < col; c++) {
						for (int j = 0; j < width + 1; j++) {
							if (i == 0 || j == 0) {
								System.out.print("*");
							} else {
								System.out.print(".");
							}
						}
					}
					System.out.print("*");
					System.out.println();
				}
			}
			for (int i = 0; i < col * (width + 1) + 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}
