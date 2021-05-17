## 과제


### 실습문제 1

public class Inputpameter {

	public static void main(String[] args) {
		System.out.println("Length: " + args.length);
		//
		System.out.println( args[0] );
		System.out.println( args[1] );
		System.out.println( args[2] );
		
		System.out.println( args[0] instanceof String);
		System.out.println( args[1] instanceof String);
		System.out.println( args[2] instanceof String);
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		System.out.println("sum : " +(	a + b + c) );
		System.out.println("avg : " + (a + b + c) / 3);
    
    Length: 3
10

25

33

true

true

true

sum : 68

avg : 22

### 실습문제 2.

public class InputPrameter {

	public static void main(String[] args) {
		System.out.println("Length: " + args.length);
		
		System.out.println( args[0] );
		System.out.println( args[1] );
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println( a + 100 );
		System.out.println( b % 10 );

		
	}

}

Length: 2
20
35
120
5

### 실습문제 3.

public class OperatoinEx4 {

	public static void main(String[] args) {
		System.out.println("Length: " + args.length);
		
		System.out.println( args[0] );
		System.out.println( args[1] );
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println( (a / b) + "..." + ( a % b ) );
		
		

	}

}


Length: 2
35
10
3...5


### 책 88p


public class StudyHomework {

	public static void main(String[] args) {
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);

		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
	}

}

false
true
false
F




