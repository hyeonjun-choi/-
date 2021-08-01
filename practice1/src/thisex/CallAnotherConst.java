package thisex;


class Person {
	String name;	
	int age;		
	
	Person() {
		this("이름없음", 1); //-- this를 사용해 Person(String, int) 생성자 호출
	}
	
	Person(String name, int age) {// 위 주석 내용이 이쪽과 연결
		this.name = name;
		this.age = age;
	}
}
 
public class CallAnotherConst {

	public static void main(String[] args) {
	Person noName = new Person();
	System.out.println(noName.name);
	System.out.println(noName.age);

	}

}
