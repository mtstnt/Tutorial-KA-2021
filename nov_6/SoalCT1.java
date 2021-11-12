package nov_6;
import java.util.*;
import java.text.*;

public class SoalCT1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input first number: ");
		double firstNumber = scanner.nextDouble();
		System.out.print("Input second number: ");
		double secondNumber = scanner.nextDouble();

		double hasilBagi = firstNumber / secondNumber;

		DecimalFormat decimal = new DecimalFormat("#0.0");

		System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber) );
		System.out.println(firstNumber + " / " + secondNumber + " = " + decimal.format(hasilBagi) );

		System.out.printf("%.1f\n", hasilBagi);

		scanner.close();
	}
}