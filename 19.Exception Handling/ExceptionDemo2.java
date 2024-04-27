

public class ExceptionDemo2 {

	public static void main(String[] args) throws ArithmeticException, NegativeArraySizeException, Exception  {
		// TODO Auto-generated method stub
		try {
			int[] arr= {98,95,100,94};
			ErrorDemo.sum(arr);
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Check array size");
		}
		
	}

}
