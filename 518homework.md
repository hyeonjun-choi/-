### p100.



public class Homework1 {

	public static void main(String[] args) {
	
		int sCore = 9;
		char grade = "A, B, C, D, F";
		
		
		if( 100 >= sCore >= 90 ) {
			System.out.println("");
		}
		else if( 90 > sCore >= 80 ) {
			System.out.println("B");
		}
		else if( 80 > sCore >= 70 ) {
			System.out.println("C");
		}
		else if( 70 > sCore >= 60 ) {
			System.out.println("D");
		}
		else {
			System.out.println("F");	
		}
		
		System.out.println(score + "점수의 등급은" + grade + "입니다");

	}

}


### p106.


public class Homework2 {

	public static void main(String[] args) {
		int floor = 1;
		char place;
		
		switch(floor) {
		case 1 : place = "약국";
				break;
		case 2 : place = "정형외과";
				break;
		case 3 : place = "피부과";
				break;
		case 4 : place = "치과";
				break;
		case 5 : place = "헬스 클럽";
				break;
		
		default : place = "장소";
		}
		System.out.println(floor + "층" + place + "입니다.");

	}

}
