## 생성자(Constructor)
- 객체를 생성할 때 new 키워드와 함께 호출한다. (객체 생성 외에는 호출할 수 없음)
- 인스턴스를 초기화 하는 코드가 구현된다. (주로 멤버 변수 초기화)
- 반환 값이 없고, 상속되지 않는다
- 생성자는 클래스 이름과 동일

## 기본생성자(Defult Constructor)
- 하나의 클래스에는 반드시 하나 이상의 생성자가 존재해야한다.
 - 프로그래머가 생성자를 구현하지 않으면 컴파일러가 생성자 코드를 넣는다.
 - 기본 생성자는 매개 변수가 없고, 구현부가 없다
 - 만약 클래스에 다른 생성자가 있는 경우 디폴트 생성자는 제공되지 않는다.
 
 ```
 	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		address = "주소없음.";
	//이렇게하면 StudentTest에서 에러가 뜸
	//생성자 StudentTest가 적용되지 않는다.
	//이유는 생성자가 하나라도 있으면 컴파일러는 디폴드 생성자 제공하지 않는다.
	}
  ```
  
  ## 참조자료형
  ```
  package reference;

public class Student {

	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	Subject eng;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
		eng = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.socore = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.socore = score;
	}
	
	public void setEnglishSubject(String name, int score) {
		eng.subjectName = name;
		eng.socore = score;
	}
	
	public void showStudentScore() {
		int total = korea.socore + math.socore + eng.socore;
		System.out.println(studentName + "학생의  점수는 " + total);
	}
}
```
```
package reference;

public class Subject {

	int socore;
	String subjectName;
}
```
```
package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 90);
		studentLee.setEnglishSubject("영어", 60);
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubject("국어", 80);
		studentKim.setMathSubject("수학", 80);
		studentKim.setEnglishSubject("영어", 80);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}

```

## 접근 제어자(Access Modifier)
- 변수, 메서드, 생성자에 대한 접근 권한 지정
- public private, protected, 아무것도 안쓰는 경우 -> 기본 접근 제어자
- private를 사용하면 클래스 외부에서는 접근 할 수가 없다.

## 정보 은닉(Information hiding)
- 외부에서 클래스 내부의 정보에 접근하지 못하도록 한다. -> private키워드를 활용
- private 변수를 외부에서 접근하게 하려면 public 메서드 제공한다. 
- 클래스 내부 데이터를 잘못 사용하는 오류를 방지 할 수 있다.


## tip
마우스 오른쪽 -> Source -> Generate Geters and Setters...


## this의 역할
 - 자신의 메모리를 가리킨다.
 - 생성자에서 다른 생성자를 호출 한다.
 - 인스턴스 자신의 주소를 반환한다.
 
 ### 생성자에서 다른 생성자를 호출
 ```
 public Person() {
 
	this("____",1);
}

public Person(String name, int age) {

	this.name = name;
	this.age = age;
}
```

### this 예제
```
package thisex;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름없음",1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + ", " + age);
	}
	
	public Person getSelf() {
		return this;
	}
}
```
```
package thisex;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.showInfo();
		
		Person personLee = new Person("Lee", 29);
		personLee.showInfo();
		System.out.println(personLee);
		
		Person p = personLee.getSelf();
		System.out.println(p);
	}
}

```
