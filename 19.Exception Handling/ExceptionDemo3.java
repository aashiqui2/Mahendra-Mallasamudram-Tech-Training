

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			System.out.println(10/0);
//		}
//		catch(ArithmeticException ae) {
//			System.out.println(ae.getMessage());//ruturndata type is string
//			ae.printStackTrace();//return datatype is void
//		}
//		System.out.println("hi");
		LowAttendanceException ll=new LowAttendanceException("low attedndance issue");
		ll.allowForExams(68);

	}

}
