### 숮제 1

```java
package java_day5;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("n을 입력하세요..");
			int n = sc.nextInt();
		 
	      int i = 0;
		 
		 for(int a; i <= n; i++ ) {
			 if(i % 2 == 1) { 
				System.out.println(i);
		 } else
		 {
			 continue;  
			 
					 
         }
         
         
         
         }
	} 
	}

```

#### 문제 이해도 부족, 중간에 막힘.

### 숙제 2

```java
package java_day5;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
		 
		
			int n = sc.nextInt();
			
			for(int i = 0; i < n-1; i++) {
				for(int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < (n*2-1) -i*2; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n-i-1; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j <= i*2; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
	}

}
```

인터넷 자료 참조. 결과 불실행. 원인 파악 못함. 재 수정 필요.
### 숙제 3

```java
package java_day5;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		
		System.out.println("n을 입력하세요..");
		int a = sc.nextInt();
		
	    int ad = 1;
		
		for( int i = 0; i < a; i++) {
		{
		}  
		
		for( int j = 0; j<a; j++) {
	 	System.out.print(ad + " ");
	 	ad = (ad + 2)%10;
		}		
					
			
```
				
			
		
			System.out.println();
			
		}		
		}	
	}
		
 
 
 n을 입력하세요..
 
3

1 3 5 

7 9 1 

3 5 7    

#### 인터넷 자료 참조, 이해 불명, 복습 필요.
