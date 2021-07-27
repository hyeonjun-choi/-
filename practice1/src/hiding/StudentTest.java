package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.StudentName = "이상원";	//오류발생
		// StudentName변수의 접근제어자가 public일떼는 private으로 바뀌면서 
		// 외부클래스의 접근이 허용되지 않기 때문.
		studentLee.setStudentName("이상원");
		// setStudentName(.)메서드를 통해 private변수에 접근 가능
		
		System.out.println(studentLee.getStudentName());

	}

}
