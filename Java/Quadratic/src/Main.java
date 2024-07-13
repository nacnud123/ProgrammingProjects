import java.util.Scanner;

// Duncan Armstrong | 11/26/18 | Calculate a quadratic equation.
public class Main {

	public static void main(String[] args) {
		double d = 0;
		double root1 = 0;
		double root2 = 0;
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the value of a: ");
		int a = in.nextInt();

		System.out.print("Enter the value of b: ");
		int b = in.nextInt();

		System.out.print("Enter the value of c: ");
		int c = in.nextInt();
		d = (b * b) - 4 * (a * c);
		if (d < 0) {
			System.out.println();
			System.out.println("Roots are imaginary");
		} else {
			root1 = (-b + Math.sqrt(d)) / (2 * a);
			root2 = (-b - Math.sqrt(d)) / (2 * a);

			System.out.println("Root 1 = " + String.valueOf(root1));
			System.out.println("Root 2 = " + String.valueOf(root2));
		}

	}

}
