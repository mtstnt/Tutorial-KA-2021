import java.util.*;

public class SoalCT3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int totalDetik = scanner.nextInt();
		int sisa;

		int jam = totalDetik / 3600;
		sisa = totalDetik % 3600;

		int menit = sisa / 60;
		sisa = sisa % 60;

		int detik = sisa;

		System.out.println(jam + ":" + menit + ":" + detik);

		scanner.close();
	}
}
