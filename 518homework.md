### Homework 1 (p100.)


```java
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
```

	점수를 입력합니다.
99

A

99점의 등급은A입니다


### HomeWork 2 (p106.)

```java

package java_homework;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("층수를 입력합니다.");
		String floor = sc.nextLine();
		
		
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
```

층수를 입력합니다.

2층

2층 정형외과입니다.

### HomeWork3 (123p q1)

```java

package java_homework;

public class HomeWork3 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		}
		else if(operator == '-') {
			result = num1 - num2;
		}
		else if(operator == '*') {
			result = num1 * num2;
		}
		else if(operator == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("연산자 오류입니다.");
			return;
		}
		System.out.println(" 결과 값은 " + result + "입니다");

	}

}
```

 결과 값은 12입니다
 
 ### HomeWork4 (123p q2)
 
 ```java
 
 package java_homework;

public class HomeWork4 {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			if(dan % 2 == 1)
				continue;
			for(times =1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times);	
			}
			System.out.println();
		}

	}

}
```


2X1=2

2X2=4

2X3=6

2X4=8

2X5=10

2X6=12

2X7=14

2X8=16

2X9=18

4X1=4

4X2=8

4X3=12

4X4=16

4X5=20

4X6=24

4X7=28

4X8=32

4X9=36

6X1=6

6X2=12

6X3=18

6X4=24

6X5=30

6X6=36

6X7=42

6X8=48

6X9=54

8X1=8

8X2=16

8X3=24

8X4=32

8X5=40

8X6=48

8X7=56

8X8=64

8X9=72

### HomeWork5 (123p q3)

```java

package java_homework;

public class HomeWork5 {

	public static void main(String[] args) {
		int dan;
		int times;
		
		
		for( dan = 2; dan <= 9; dan++) {
			for( times = 1; times <= 9; times++ ) {
				if( dan < times )
					break;
			
					System.out.println(dan + "X" + times + "=" + dan * times);
				}
				System.out.println();
	
				}
		}
				
}
```


2X1=2

2X2=4

3X1=3

3X2=6

3X3=9

4X1=4

4X2=8

4X3=12

4X4=16

5X1=5

5X2=10

5X3=15

5X4=20

5X5=25

6X1=6

6X2=12

6X3=18

6X4=24

6X5=30

6X6=36

7X1=7

7X2=14

7X3=21

7X4=28

7X5=35

7X6=42

7X7=49


8X1=8

8X2=16

8X3=24

8X4=32

8X5=40

8X6=48

8X7=56

8X8=64


9X1=9

9X2=18

9X3=27

9X4=36

9X5=45

9X6=54

9X7=63

9X8=72

9X9=81


### HomeWork6 (p123 q4)

```java

int lineCount = 4;  
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			spaceCount-=1;
			starCount+=2;
			System.out.println();
		}
	}
}
``` 
 
```cmd
                  *   
                 ***  
                ***** 
               *******
 ```
 
### HomeWork7 (p123 q5)

```java

package java_homework;

public class HomeWork7 {

	public static void main(String[] args) {
		int lineCount = 9;  //다른 홀수 값을 넣어보세요
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			
			if(i < lineCount/2) {
				spaceCount-=1;
				starCount+=2;
			}
			else {
				spaceCount+=1;
				starCount-=2;
			}
			System.out.println();
		}
	}

	}

```
```cmd

      *     
     ***    
    *****   
   *******  
  ********* 
   *******  
    *****   
     ***    
      *     
```


### HomeWork8

```java

package java_homework;

import java.util.Scanner;

public class HomeWork8 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		String oper;

		
		System.out.println("숫자.");
		num1 = scan.nextInt();
		
		System.out.println("부호.");
		oper = scan.next();
		
		System.out.println("숫자.");
		num2 = scan.nextInt();
		
		

		switch(oper) {
		
		case "+":
			System.out.println("계산값 : " + (num1 + num2) );
			break;
			
		case "-":
			System.out.println("계산값 : " + (num1 - num2) );
			break;
			
		case "*":
			System.out.println("계산값 : " + (num1 * num2) );
			break;	
		
		case "/":
			System.out.println("계산값 : " + (num1 / num2) );
			break;	
		}
		
	}

}

```

숫자.

20

부호.

-

숫자.

8

계산값 : 12

### HomeWork9

```java

package java_homework;

import java.util.Scanner;

public class HomeWork9 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
		
		String height;
		int weight;
	
		
	while(true)	{	
		
		System.out.println("키");
		height = scanner.next();
		
		if(height.equals("-1") ||height.equals("q")) {
			System.out.println("끝");
			break;
		}
		
		System.out.println("몸무게");
		weight = scanner.nextInt();
		
		// if - else 를 사용하였습니다.
		if( Integer.parseInt(height) + 100 - weight > 0) {
			System.out.println("비만수치 비만");
		}
		else {
			System.out.println("정상");
		}
			
	}	
	
	}

}

```


키

168

몸무게

80

비만수치 비만

키

-1

끝


### 숙제 후기

약 3, 4개의 문제의 경우 책과 수업자료를 토대로 해결할 수 있었음.

그 외의 나머지의 문제들의 경우 해결방안을 쉽게 찾지 못해 인터넷의 도움을 받음.

입력해결까지 하였으나 아직까지 완벽하게 이해하긴 어려운 상태로 추후 보완 필요.
