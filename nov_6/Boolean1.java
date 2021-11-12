package nov_6;
import java.util.*;

public class Boolean1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int tahun = scanner.nextInt();

		// Kalau habis dibagi 400 -> Kabisat
		// Kalau tdk habis dibagi 400 tapi habis dibagi 100 -> Bukan kabisat
		// Kalau tidak habis dibagi 400 & 100, kalau habis dibagi 4 -> kabisat
		// Kalau tdk bisa dibagi semua di atas -> Bukan kabisat.

		if (tahun % 400 == 0) {
			System.out.println("Kabisat");
		} 
		else if (tahun % 100 == 0) {
			System.out.println("Bukan Kabisat");
		}
		else if (tahun % 4 == 0) {
			System.out.println("Kabisat");
		}
		else {
			System.out.println("Bukan Kabisat");
		}

		scanner.close();
	}
}
