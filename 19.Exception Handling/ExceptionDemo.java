
import java.util.*;

public class ExceptionDemo {

	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the number ");
			int no1 = sc.nextInt();
			int no2 = sc.nextInt();
			ed.divide(no1, no2);
			ed.subtract(no1, no2);
		} catch (Exception e) {
			System.out.println("something went wrong please check");
		}

	}

	private void subtract(int no1, int no2) {
		System.out.println(no1 - no2);
	}

	private void divide(int no1, int no2) {
		try {// Exception possible area
			System.out.println(no1 / no2);
			int[] arr = new int[no2];
			System.out.println(arr.length);
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArithmeticException ae) {
			// exception handling area
			System.out.println("check second No");
			// divide();
		} catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException ar) {
			System.out.println("check array length");
		}
		// we need to put this catch at last for handling all types of exception
		catch (Exception e) {
			System.out.println("something went wrong please check");
		} finally {
			// will be executed always whether there is a exception or not
			// code cleaning area
			// db disconnection
			System.out.println("check me");
		}
	}

}
