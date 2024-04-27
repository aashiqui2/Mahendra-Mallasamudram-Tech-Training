

public class LowAttendanceException extends RuntimeException{

public LowAttendanceException(String msg) {
		// TODO Auto-generated constructor stub
//	System.out.println(msg);
	System.err.println(msg);
	}

	//throwable
//exception
//RuntimeException
//throw
	public void allowForExams(int attendance) {
		//100/0
		//-5
		//
		if(attendance>=75) {
			System.out.println("permitted students to join");
		}
		else {
			try {
//				LowAttendanceException lae=new LowAttendanceException();
				throw new LowAttendanceException("");//Anonymous Object	
			}
			catch(LowAttendanceException ll) {
				System.out.println("Check Attendance");
			}
				
		}
	}

}
