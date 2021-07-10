package classpart;

public class Student {		//public <클래스를 만드는 예약어> <클래스 이름>
	int studentID;			//학번]
	String studentName;		//이름]	멤버
	int grade;				//학년]	변수
	String address;			//주소]	
	
	public void showStudentInfo( ) {
		System.out.println(studentName + " , " + address);  // 이름, 주소 출력
	}														// 메서드 추가
	
	public String getStudentName( ) {	//학생 이름 반환하는 메서드 
		return studentName;				//이 메서드의 반환 값 자료형이 String이므로 반환형 역시
	}									//String이어야 한다.
	
}

