### p100.



package java_homework;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력합니다.");
		String str = sc.nextLine();
		
		int sCore = Integer.parseInt(str); 
		char grade = 0; 
		
		
		if( sCore >= 90 & sCore <= 100 ) {
			grade = 'A';
			System.out.println("A");
		}
		else if( sCore >= 80 & sCore <= 100 ) {
			grade = 'B';
			System.out.println("B");
		}
		else if( sCore >= 70 & sCore <= 100 ) {
			grade = 'C';
			System.out.println("C");
		}
		else if( sCore >= 60 & sCore <= 100 ) {
			grade = 'D';
			System.out.println("D");
		}
		else if( sCore < 60 & sCore <= 100){
			grade = 'F';
			System.out.println("F");	
		}
		else {
			System.out.println("100점 이상은 계산에 넣지 않습니다.");
		}
		
		System.out.println(sCore + "점의 등급은" + grade + "입니다");

	}
	}

### p106.

package java_homework;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("층수를 입력합니다.");
		String str = sc.nextLine();
		
		int num = Integer.parseInt(str);
		String floor = "place";
		
		switch(floor) {
		case "1층":
		System.out.println("1층 약국입니다.");
		break;
		case "2층":
		System.out.println("2층 정형외과입니다.");
		break;
		case "3층":
		System.out.println("3층 피부과입니다.");
		break;
		case "4층":
		System.out.println("4층 치과입니다.");
		break;
		case "5층":
		System.out.println("5층 헬스 클럽입니다.");
		break;
		default:
		System.out.println("건물이 없습니다.");
		break;
		
		
		
		}
		
		
	}
}

### 123p.

