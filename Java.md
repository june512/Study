## 클래스 

### 클래스 생성하기
```
new 키워드를 사용하여 생성자로 생성
Student studentLee = new Student();
```
### 클래스의 속성, 메서드 참조하기
```
생성에 사용한 변수(참조변수)로 클래스의 속성, 메소드 참조
studentLee.studentName = "Lee";
studentLee.showStudentInfo();
```

### 자바 파일 하나에 여러 개의 클래스가 존재 할 수도 있음.
 단, public 키워드가 있는 클래스는 작업 파일과 이름이 동일해야한다.

Student.java
```
package class

// 글래스 이름이 작업 파일 이름과 동일해야 함.
public class Studnet{

}

// 클래스 이름이 작업 파일 이름과 동일하지 않아도 됨.
class ABC{

}
```

## 함수(Function)
 - 하나의 기능을 수행하는 일련의 코드
 - 함수는 호출하여 사용하고 기능이 수행된 후 값을 반환 할 수 있다.
 - 함수로 구현된 기능은 여러 곳에서 호출되어 사용될 수 있다.

```
public class FunctionTest {

 public static int addNum(int num1, int num2) {
  int result;
		result = num1 +num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum = 0;
		int i;
		for(i = 0 ; i <= 100 ; i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 20;
		
		//n1, n2의 값이 num1, num2로 넘어간다.
		int total = addNum(n1, n2);
		
		sayHello("안녕하세요");
		int num = calcSum();
		
		System.out.println(total);
		System.out.println(num);
	}

}


출력 결과 : 
안녕하세요
30
5050
```
