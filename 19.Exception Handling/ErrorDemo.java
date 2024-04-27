

public class ErrorDemo {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, ArithmeticException, NegativeArraySizeException, Exception  {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		sum(arr);
	}

	public static void sum(int[] arr) 
	throws ArrayIndexOutOfBoundsException,
	ArithmeticException,
	NegativeArraySizeException,Exception{
		// TODO Auto-generated method stub
		int total = 0;
		for (int i = 0; i < 5; i++) {
			total = total + arr[i];
		}
		System.out.println("Total " + total);

	}
}
