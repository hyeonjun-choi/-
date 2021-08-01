package thisex;

 class BirthDay {

	 int day;		//정수형 int로 
	 int month;		//
	 int year;		//
	 
	 public void setYear(int year) {					//]--- 태어난 연도 지정 메서드
		 this.year = year;	//bDay.year = year;와 동일	//]
	 }													//]
	 
	 public void printThis() {		//]---this 출력 메서드
		 System.out.println(this);	//]-----System.out.println(bDay);와 동일
	 }								//]
 } 
 
public class ThisExample { 
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);			//태어난 연도 2000 지정
		System.out.println(bDay);	//참조 변수 출력
		bDay.printThis();			//this 출력 메서드 호출
	}


	}


/*

스택 메모리				힙 메모리
						[ [							]
SetTear()--this---->	[ [year	]BirthDay 클래스 생성	]
main()	 --bDay---->	[ [month	]					]
		 --args			[ [day	]					]
						[ [							]
*/